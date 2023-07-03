public class Main {
    public static void main(String[] args) {
        Employee sm1 = new SalesManager(567,
                                                "John",
                                                "Doe",
                                                2000,
                                                    40,
                                                10000,
                                                0.02 );

        Employee wm1 = new WageEmployee(444,
                "Jack",
                "Nicolson",
                1945,
                30,
                15.5);



        Employee sm2 = new SalesManager(124,
                "Ann",
                "Anderson",
                2000,
                80,
                10000,
                0.05 );

        Employee wm2 = new WageEmployee(654,
                "Jack",
                "Berg",
                1965,
                30,
                16.5);


        Employee sm3 = new SalesManager(333,
                "Kerk",
                "Douglas",
                2000,
                80,
                5000,
                0.1 );

        Employee wm3 = new WageEmployee(446,
                "Clint",
                "Eastwood",
                1945,
                30,
                15.5);

        System.out.println(sm1.calculateSalary());
        System.out.println(wm1.calculateSalary());

        Company company = new Company(10);

        System.out.println(" Empty Employees list");
        company.display();

        company.addEmployee(sm1);
        company.addEmployee(wm1);
        company.addEmployee(sm2);
        company.addEmployee(wm2);
        company.addEmployee(sm3);
        company.addEmployee(wm3);

        System.out.println(" Employees list, 6 employees");
        company.display();

        System.out.println("Remove sm1");
        company.removeEmployee(sm1);
        company.display();

        System.out.println();
        System.out.println();
        System.out.println("Everybody's salary"+company.sumSalary());

        System.out.println("Employees sorted");
        company.sortEmployees();


      //  salesManager.printParentClassName();
    }


  /*
    Создать программу для бухгалтерии, которая будет уметь следующее:
    - добавлять сотрудников в штат
    - удалять сотрудников из штата
    - рассчитывать зарплату для двух категорий сотрудников
                -сотрудник с почасовой оплатой
                -менеджер по продажам

     У программы должны быть следующие классы :
      классы сотрудников : абстрактный родительский класс Employee
                           сотрудник на зарплате WageEmployee
                           менеджер по продажам  SalesManager
        У сотрудников должны быть такие поля :
            id, имя, фамилия ,год рождения, количество проработанных часов
            и метод для расчета зарплаты ( calculateSalary)
        У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен
        учитывать минимальный размер оплаты труда
        У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается ка процент от обьема продаж.
        Но его метод оплаты также должен учитывать минимальный размер оплаты труда
        private double salesVolume
        private double percent

      класс Company, имеющий методы для :
                        -добавления сотрудника ( addEmployee),
                        -удаления сотрудника ( removeEmployee)
                        -вывода на экран списка сотрудников ( display)
                        -суммирования зарплат всех сотрудников (sumSalary)
                        -сортировки сотрудников по фамилии  (sortEmployees)
   */
}
