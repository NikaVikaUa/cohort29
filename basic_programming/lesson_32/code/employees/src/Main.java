import java.util.Arrays;
import java.util.Comparator;

public class Main {

    /*
    Создать класс Employee c полями id, name, age, salary.
    Задать естественный порядок его сортировки по id. Сделать дополнительные возможности сортировки по зарплате, возрасту, имени а
    также сортировку по возрасту и затем имени если возраст одинаковый. Протестировать.
     */
    public static void main(String[] args) {
        Employee[] employees = {new Employee(10,"Debora",75,10000),
                                new Employee(5,"Boris",29,20000),
                                new Employee(15,"Ann",32,5000),
                                new Employee(3,"John",32,5000)
                                                                                    };

        Arrays.sort(employees);
        System.out.println("by id");
        System.out.println(Arrays.toString(employees));


        Arrays.sort(employees,new SalaryComparator());
        System.out.println("by salary");
        System.out.println(Arrays.toString(employees));


        Arrays.sort(employees,new AgeComparator());
        System.out.println("by age");
        System.out.println(Arrays.toString(employees));


        Arrays.sort(employees,new NameComparator());
        System.out.println("by name");
        System.out.println(Arrays.toString(employees));



        Arrays.sort(employees,new AgeNameComparator());
        System.out.println("by age and then name");
        System.out.println(Arrays.toString(employees));

        System.out.println();
        System.out.println("with Lambda");
        System.out.println();

        Comparator<Employee> salComparator = (e1,e2)->Double.compare(e1.getSalary(),e2.getSalary());
        Arrays.sort(employees,salComparator);
        System.out.println("by salary");
        System.out.println(Arrays.toString(employees));

        Comparator<Employee> nameComparator = (e1,e2)-> e1.getName().compareTo(e2.getName());
        Arrays.sort(employees,nameComparator);
        System.out.println("by name");
        System.out.println(Arrays.toString(employees));


        Comparator<Employee> ageNameComparator =(e1,e2) ->{
            int res = Integer.compare(e1.getAge(),e2.getAge());
            if( res == 0)
                res = e1.getName().compareTo(e2.getName());
            return res;
        };
        Arrays.sort(employees,new AgeNameComparator());
        System.out.println("by age and then name");
        System.out.println(Arrays.toString(employees));


    }
}
