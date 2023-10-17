import repositories.UserCrudRepository;
import repositories.UserRepositoryFileImpl;
import services.UserService;
import services.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //UserCrudRepository repository = new UserRepositoryListImpl();
        UserCrudRepository repository = new UserRepositoryFileImpl("user.txt");
        UserService service = new UserServiceImpl(repository);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите имя пользователя (или 'exit' для завершения): ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            }
            System.out.print("Введите email пользователя: ");
            String email = scanner.nextLine();
            service.addNewUser(name,email);
        }

        System.out.println(service.getAllUsers());



    }
}