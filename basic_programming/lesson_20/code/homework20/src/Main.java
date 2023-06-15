public class Main {

    public static void main(String[] args) {
        Voter voter1 = new Voter("John","Street1",10);
        Voter voter =voter1;

        System.out.println(voter.getName());

        voter1.setName("Kate");

        System.out.println(voter.getName());


        System.out.println(voter1.getName());

        System.out.println(voter1.getName()+"'s age before setter: "+ voter1.getAge());

        voter1.setAge(10);

        System.out.println(voter1.getName()+"'s age after setter: "+voter1.getAge());


        System.out.println(voter1);
        int a =10;
        int b = a;
         b = 10;
        String str = "Java";



    }
}
