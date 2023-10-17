import repositories.LessonRepository;
import repositories.LessonRepositoryFileImpl;
import repositories.UserCrudRepository;
import repositories.UserRepositoryFileImpl;
import services.LessonService;
import services.LessonServiceImpl;
import services.UserService;
import services.UserServiceImpl;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        LessonRepository repository = new LessonRepositoryFileImpl("lesson.txt");
        LessonService service = new LessonServiceImpl(repository);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер урок (или 'exit' для завершения): ");
            String numberLesson = scanner.nextLine();

            if (numberLesson.equals("exit")) {
                break;
            }
            int number = Integer.parseInt(numberLesson);
            System.out.print("Введите предмет: ");
            String subject = scanner.nextLine();
            System.out.print("Введите тему урока: ");
            String topic = scanner.nextLine();

            service.createLesson(number,subject,topic);
        }

        System.out.println(service.getAllLessons());



    }
}