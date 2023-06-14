public class Employee {

    private String name;

    private int age;

    private String address;

    private int salary;

    public Employee(String name, int age, String address, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public String getName() { // геттер возвращает значение соответствующей переменной
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 17) { //  возраст будет заменен на новое значение только если он больше 17 лет
            this.age = age;
        } else {
            System.out.println("Employee's age cannot be less than 18 !");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int salary) {
        if (salary < 0 || salary > 10000) {
            System.out.println("Salary is in the wrong range");
        } else {
            this.salary = salary;
        }
    }
}
