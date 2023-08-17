public class Person {

    public String name;

    public Person( String name){
        this.name = name;
    }

    public synchronized void howAreYouDoing( Person person) throws  InterruptedException{
        System.out.println("How are you doing, " + person.name + "?");

        Thread.sleep(1000);

        person.iAmFineThanksAndYou(this);
    }

    public synchronized void iAmFineThanksAndYou(Person person){

        System.out.println("I am fine, "+ person.name + ", thanks, and you?");
    }

    public static void main(String[] args) throws InterruptedException {
        Person john = new Person("John");
        Person peter = new Person("Peter");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    john.howAreYouDoing(peter);
                } catch (InterruptedException ex){
                    ex.getMessage();
                }

            }
        });
        thread.start();
        thread.join();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    peter.howAreYouDoing(john);
                } catch (InterruptedException ex){
                    ex.getMessage();
                }
            }
        }).start();
    }
}
