public interface Driveable {
    void drive();

    default void stop(){
        System.out.println("can stop");
    }
}
