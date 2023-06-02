import java.util.Scanner;
 // версия студента
public class HWver2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write different numbers");
    System.out.println("Write number one:");
    int num1 = scanner.nextInt();
    System.out.println("Write number two:");
    int num2 = scanner.nextInt();
    if(num1 != num2) {
      System.out.println("Write number three:");
      int num3 = scanner.nextInt();
      if(num3 != num1 && num3 != num2){
        System.out.println("Write number four:");
        int num4 = scanner.nextInt();
        if(num4 != num1 && num4 != num2 && num4 != num3) {
          if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("Maximum number is num1");
          } else if (num2 > num3 && num2 > num4) {
            System.out.println("Maximum number is num2");
          } else if (num3 > num4) {
            System.out.println("Maximum number is num3");
          } else {
            System.out.println("Maximum number is num4");
          }
        }else{
          System.out.println("Please write different numbers");
        }
      }else{
        System.out.println("Please write different numbers");
      }
    }else{
      System.out.println("Please write different numbers");
    }
  }
}
