public class OurIntNumber {

    private int x;

    OurIntNumber( int x){
        this.x = x;
    }

    int getX() {
        return x;
    }

    boolean isFactor( int n){
        return (x % n) == 0;
    }
}
