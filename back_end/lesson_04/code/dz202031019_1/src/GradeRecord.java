public class GradeRecord {
    private String name;
    private double grade;

    public GradeRecord(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }
}
