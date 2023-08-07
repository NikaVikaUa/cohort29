import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car a, Car b) {
        return a.getBrand().toUpperCase().compareTo(b.getBrand().toUpperCase());
    }
}
