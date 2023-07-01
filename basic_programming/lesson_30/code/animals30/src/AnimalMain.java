import java.util.Arrays;

public class AnimalMain {
    /*
   1. Создать класс Animal c полями name, weight, colour
   2. Вывести на экран список животных упорядоченный отдельно по имени,
        по весу, по цвету. Для реализации разных видов сортировки использовать интерфейс компаратор
   3*  Вывести на экран список ИМЕН животных, упорядоченный  по возрастанию последней буквы имени
   4. Протестировать
     */
    public static void main(String[] args) {


        Animal wolf = new Animal("Wolf", 100, "grey");
        Animal elephant = new Animal("Elephant", 1000, "white");
        Animal bear = new Animal("Bear", 500, "brown");
        Animal fox = new Animal("Fox", 30, "red");
        Animal anakonda = new Animal("Anakonda", 400, "yellow");

        Animal[] zoo = {wolf, elephant, bear, fox, anakonda};

        for (Animal an : zoo) {
            System.out.println(an);
        }

        System.out.println("---------------------By Name--------------------------------");
        Arrays.sort(zoo, new ComparatorByName());

        for (Animal an : zoo) {
            System.out.println(an);
        }


        System.out.println("--------------By Weight------------------");

        Arrays.sort(zoo, new ComparatorByWeight());
        for (Animal an : zoo) {
            System.out.println(an);
        }

        System.out.println("------------Names by last letter--------------");

        Arrays.sort(zoo, new ComparatorByLastLetter());
        for (Animal an : zoo) {
            System.out.println(an.getName());
        }

    }
}

