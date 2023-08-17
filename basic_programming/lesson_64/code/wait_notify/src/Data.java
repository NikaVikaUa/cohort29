public class Data {

    private String packet;

    // True - если приемник должен ждать
    // false -  если передатчик должен ждать
    private boolean transfer = true;

    public synchronized String receive(){
        while(transfer) {
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }

        String returnPacket = packet;

        transfer = true;

        notifyAll();

        return returnPacket;
    }


    public synchronized void  send ( String packet){
        while(!transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }  // here

            this.packet = packet;

            transfer = false;
            notifyAll();

    }
}
