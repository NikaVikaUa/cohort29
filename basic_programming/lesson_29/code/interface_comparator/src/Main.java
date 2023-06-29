import java.util.Arrays;

public class Main {
    /*
      Интерфейс Компаратор предоставляет классам возможности сортировки по
      дополнительным критериям, отличным от сортировки в естественном порядке, заданном с помощью интерфейса Comparable
      Этот интерфейс находится в пакете java.util  и имеет единственный метод compare().

      public interface Comparator<T>{

         public int compare ( T o1, T o2 );

      }

      Метод принимает 2 обьекта и сравнивает их так :
      - результат сравнения отрицательное число если первый обьект меньше второго
      - ноль если равны
      - положительное число если первый больше второго
     */
    public static void main(String[] args) {
        Author rowling = new Author("Rowling", "Harry Potter", 1997);
        Author tolkien = new Author("Tolkien", "Lord of the Rings", 1954);
        Author reid = new Author("Reid", "Headless Horseman", 1866);
        Author orwell = new Author("Orwell", "1984", 1949);
        Author remark = new Author("Remark", "Three Comrades", 1936);

        Author[] library = {rowling, tolkien, reid, orwell, remark};

        System.out.println("Print before sorting:");
        for (Author author : library) {
            System.out.println(author);
            System.out.println("------------");
        }

        System.out.println("Sorting by author's name:");
        Arrays.sort(library);
        for (Author author : library) {
            System.out.println(author);
            System.out.println("------------");
        }

        System.out.println();
        System.out.println("Sorting by publishing date:");
        Arrays.sort(library, new PublishingYearComparator());// метод sort принимает кроме массива для сортировки
                                                                 // также обьект компаратора в соответствии с методом
                                                                 // compare которого и будет происходить сортировка
        for (Author author : library) {
            System.out.println(author);
            System.out.println("------------");
        }

        System.out.println();
        System.out.println("Sorting by book's name:");
        Arrays.sort(library,new BookNameComparator());

        for (Author author : library) {
            System.out.println(author);
            System.out.println("------------");
        }
        // еще один вариант использования метода sort -  сортировка части массива
        int[] ints = {4,8,1,6,0,2};
        Arrays.sort(ints,1,4);
        System.out.println(Arrays.toString(ints));
    }
}
