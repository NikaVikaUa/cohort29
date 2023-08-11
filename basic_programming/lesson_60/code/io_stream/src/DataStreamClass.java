import java.io.*;

public class DataStreamClass {

    // Класс DataOutputStream - позволяет записывать данные примитивных типов
    // writeInt( int i) -записывает int
    // writeFloat -  записывает в поток 4-байтовое значение float
     //  и т. д.
    // writeUTF( String str)  записывает строку в кодировке UTF -8
    //  у класса DataInputStream -  аналогичные методы read

    public static void main(String[] args) {
        Employee john = new Employee("John",35,1000.5,false);

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin")))
        {
            dos.writeUTF(john.name);
            dos.writeInt(john.age);
            dos.writeDouble(john.salary);
            dos.writeBoolean(john.isManager);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.bin")))
        {
            String name = dis.readUTF();
            int age = dis.readInt();
            boolean isManager = dis.readBoolean();
            double salary  = dis.readDouble();
          //  boolean isManager = dis.readBoolean();

            System.out.println("John:");
            System.out.println("name: "+name );
            System.out.println("age: "+age );
            System.out.println("manager? : "+isManager );
            System.out.println("salary: "+salary );

        }
        catch (IOException e){
            System.out.println("IO Exception");
        }
    }
}
