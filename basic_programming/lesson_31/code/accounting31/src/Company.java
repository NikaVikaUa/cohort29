import java.util.Arrays;

public class Company {

    private Employee[] employees;// массив сотрудников
    private int companySize;

    public Company(int capacity) { // через конструктор будем передавать количество сотрудников,
                                    // которое компания может нанять на работу ( переменная capacity)
        employees = new Employee[capacity];
        companySize = 0; // начальный размер компании
    }

    public boolean addEmployee(Employee employee){              // метод, добавляющий сотрудника
        if( companySize < employees.length){
            employees[companySize] = employee; //  добавляем сотрудника
            companySize++;
            return true;
        }
        return false;
    }


    public boolean removeEmployee (Employee employee){ //  метод для удаления сотрудника
        for (int i = 0;i < companySize;i++){ // проходим по всем элементам массива и сравниваем их с
                                            // искомым
            if(employees[i].equals(employee)){
                employees[i] = employees[companySize-1];
                companySize--;
                return true;
            }
        }
        return false;
    }


    public void display(){ // метод, выводящий на экран спсиок сотрудников
        for (int i = 0; i<companySize;i++){
            System.out.println(employees[i]);
        }
    }

    public double sumSalary(){ // метод, суммирующий зарплаты всех сотрудников
        double sum = 0;
        for ( int i = 0; i<companySize;i++){
            sum = sum + employees[i].calculateSalary();
        }
        return sum;
    }

    public void sortEmployees(){ // сортировка и вывод на экран
        Arrays.sort(employees,0,companySize);// сортировка не всего массива, а
                                                            // его части от элемента с индексом 0 до
                                                            // элемента с индексом compsnzSize

        display();

    }



}
