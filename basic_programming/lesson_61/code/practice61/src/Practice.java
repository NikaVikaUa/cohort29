import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        System.out.println(composeList("classPeople.txt"));
    }

    /*
      1.  Пусть есть текстовый файл такого вида
        John, 25
        Jack, 37
        Ann, 18

        написать метод, читающий этот файл и возвращающий список людей старше 18 лет,
        отсортированный по возрасту.
        Файл не пустой
            List<Person> composeList( String fileName)
*/
    public static List<Person> composeList(String fileName) {
        List<Person> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                temp.add(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        for (String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18)
                persons.add(new Person(nameAge[0].trim(), age));
        }
        Collections.sort(persons);

        return persons;
    }
    /*
     2. Пусть есть текстовый  файл такого вида:  имя, фамилия, оборудование, цена ( имена могут
        повторяться)
        Evgeny, Grazhdanskiy, Notebook, 500
        John, Smith, Mac, 800
        Evgeny, Grazhdanskiy, Keybord, 25
        John, Smith, Mouspad,5
        Jack, Burns, Apple, 1000


        Нужно написать  метод,  который запишет эту информацию в выходной файл в таком виде:
        имя фамилия сумма позиций
        Evgeny Grazhdanskiy 525
        John Smith 805
        Jack Burns 1000

     */

}
