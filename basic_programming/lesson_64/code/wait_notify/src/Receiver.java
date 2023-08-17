public class Receiver implements Runnable {
    private Data load;

    public Receiver(Data load) {
        this.load = load;
    }

    public void run() {
        for (String receivedMessage = load.receive();
             !"End".equals(receivedMessage);
             receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}
