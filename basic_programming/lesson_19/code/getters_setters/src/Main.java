public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John",47,"Street1",3000);
        System.out.println(" employee John:");
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());

     //   employee.salary = 10000000;
     //   employee.age = 1;
      //  employee.getName()="Ann";

        System.out.println(" employee John:");
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());

        employee.setAge(76);
        employee.setSalary(-1000);

        System.out.println(" employee John:");
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());

        employee.setAge(-2);
        employee.setSalary(1000000000);

        System.out.println(" employee John:");
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getSalary());




    }
}
