import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework {
    public static void main(String[] args) throws IOException {

        File fileName = new File("input.txt");

        System.out.println(readIntoString(fileName));
        System.out.println(returnSum("inputInt.txt"));
        System.out.println("the longest string is " + findLongestLine(fileName));
    }


    /*
    Задача 1
Написать метод, читающий текстовый файл и возвращающий строку,
состоящую из строчек этого файла, разделенных пробелом.
     */

    public static String readIntoString(File fileName) throws IOException {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(" ");
            }
        }
        return new String(sb);
    }

    /*
    Есть файл такого вида
       1
       2
       3
       4
       5
       Написать метод, принимающий этот файл и возвращающий сумму чисел.
     */

    public static int returnSum(String fileName) {
        int sum = 0;
        String nextInt;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((nextInt = br.readLine()) != null) {
                sum = sum + Integer.parseInt(nextInt);
            }

        } catch (IOException e) {
            e.getMessage();
        }
        return sum;
    }

    /*
    Написать метод, принимающий текстовый файл и находящий самую длинную строку в нем.
    Метод возвращает эту строку */
    public static String findLongestLine(File fileName) {
        String longest = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String current;

            while ((current = br.readLine()) != null) {
                if (current.length() > longest.length())
                    longest = current;
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return longest;
    }
}



