public class SalesManager extends Employee{

    private double salesVolume;
    private double percent;

    public SalesManager(int id, String firstName, String lastName, int yearOfBirth, double hour, double salesVolume, double percent) {
        super(id, firstName, lastName, yearOfBirth, hour);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public double getPercent() {
        return percent;
    }

    public double calculateSalary(){
        double salary = salesVolume*percent;
        if ( salary < getHour()*StateConstants.MIN_WAGE){
            salary = getHour()*StateConstants.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+"SalesManager{" +
                "salesVolume=" + salesVolume +
                ", percent=" + percent +
                '}';
    }

//    public void printClassName(){
//        System.out.println("I am SalesManager class");
//    }
//    public void printParentClassName(){
//       super.printClassName();
//    }
}
