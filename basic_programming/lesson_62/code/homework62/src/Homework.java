import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Homework {
    public static void main(String[] args) {
        getModifiedList("inputList.csv","outputList.csv");
    }
    /*
    Пусть есть текстовый  файл такого вида:  имя, фамилия, оборудование, цена ( имена могут
        повторяться)
        Evgeny, Grazhdanskiy, Notebook, 500
        John, Smith, Mac, 800
        Evgeny, Grazhdanskiy, Keybord, 25
        John, Smith, Mouspad,5
        Jack, Burns, Apple, 1000


        Нужно написать  метод,  который запишет эту информацию в выходной файл в таком виде:
        имя фамилия сумма позиций
        Evgeny Grazhdanskiy 525
        John Smith 805
        Jack Burns 1000
     */

    public static void getModifiedList( String inFile, String outFile){
        try(BufferedReader br = new BufferedReader( new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile)))    {

            String line;
            Map<String,Integer>result = new HashMap<>();

            while ((line = br.readLine()) != null){
                System.out.println(line);

                String[] entry = line.split(",");
                String name = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());

                if( result.containsKey(name))
                    result.put(name,price + result.get(name));
                else result.put(name,price);

                // john smith = 300
            }
            for(Map.Entry<String,Integer>me : result.entrySet()){
                bw.write(me.getKey()+' '+me.getValue());
                bw.newLine();
            }

        }catch ( IOException e){
            e.printStackTrace();
        }
    }
}
