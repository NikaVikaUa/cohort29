public class Main1 {

    // Continue statement
    /*
    Continue используется внутри цикла. Если в цикле встречается continue,
    то контроль передается непосредственно в начало цикла и происходит выполнение
    следующей итерации ( прохода цикла), а оставшиеся  после continue команды
    пропускаются
     */
    public static void main(String[] args) {

        for ( int i = 0 ; i <= 6; i++){

            if ( i == 4){
                continue;
            }

       //     System.out.print(i+" ");

        }

        // break -
      /*
         используется для немедленного выхода из цикла. Если программа встречает
         в цикле слово break,  выполнение цикла прекращается и начинается выполнение кода следующего за циклом.
       */

        for (int i = 100; i>=10;i--){

            System.out.println("i: "+i);

            if(i ==98){
                break;
            }
        }
        System.out.println("we are out of for-loop");
    }

}
