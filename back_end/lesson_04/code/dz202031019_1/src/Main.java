import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
1. Дан файл со списком студентов:
jack,3
john,5
nick,1
jack,4
и т.д.   т.е. *имя,оценка"
необходитмо:
   - получить мэп, где ключ это имя студента, значение сколько у студента оценок (в рамках этой задачи, строки с одинаковым именем относятся к одному студенту т.е. у jack 2 оцеки)
   - получить список студентов с средним балом больше заданного.
Ркализоавть тесты.

 */
public class Main {
    public static final String FILE_NAME = "student.txt";

    public static void main(String[] args) {
        List<GradeRecord> gradeRecordsList = readFile();
        System.out.println(gradeRecordsList);
        System.out.println("-----------------------");
        Map<String, Long> map = mapCountingGradesByStudent(gradeRecordsList);
        System.out.println(map);

        List<GradeRecord> students = bestStudents(gradeRecordsList, 3);
        System.out.println(students);

    }

    public static List<GradeRecord> readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return reader.lines()   // "jack,3"
                    .map(s -> s.split(","))
                    .filter(arr -> arr.length == 2)
                    .map(arr -> new GradeRecord(arr[0], Integer.parseInt(arr[1])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Map<String, Long> mapCountingGradesByStudent(List<GradeRecord> list){
        //Map<String, Long> map = list.stream().collect(Collectors.groupingBy(gr -> gr.getName(), Collectors.counting()));
        Map<String, Long> map = list.stream().collect(Collectors.toMap(gr -> gr.getName(),gr->1L, (v1,v2)->v1+v2 ));
        return map;
    }


    public  static List<GradeRecord> bestStudents(List<GradeRecord> list, double avg){
        Map<String, Double> map = list.stream()
                .collect(Collectors.groupingBy(gr -> gr.getName(), Collectors.averagingDouble(gr -> gr.getGrade())));

        List<GradeRecord> res = map.entrySet().stream()
                .filter(e -> e.getValue() > avg)
                //.collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
                .map(e -> new GradeRecord(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
        return res;

    }


}