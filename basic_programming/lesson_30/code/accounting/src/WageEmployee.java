public class WageEmployee extends Employee {

    private double wage;

    public WageEmployee(int id, String firstName,String lastName,int year, double hour, double wage){
        super(id,firstName,lastName,year,hour);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}';
    }
}
