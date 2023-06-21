public class Main {

    // В Джава существует три класса работающие со строками:
  /*
    1.String
    2.StringBuilder
    3.StringBuffer - практически тоже что и StringBuilder, но синхронизирован
    и его целесообразнее использовать в многопоточном программировании.

    Обьекты класса StrinBuilder  изменяемы в отдичие от обьектов класса String

    конструкторы класса StringBuilder:
    1. StringBuilder() - создает пустой обьект
    2. StringBuilder( String str) - создает обьект с такой строкой
    3. StringBuilder( int length ) - создает пустой обьект с определенной длиной


    Методы StringBuilder:

    append(String s) - используется для добавления строки в скобках к строке-обьекту StringBuilder
    append(char)
    append(boolean)
    append(float)
    append(int )   и т.д.

   */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();// создали пустой StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");// создали СтрингБилдер со словом Hello
        stringBuilder.append(" World"); // присоедигяем слово World  и первоначальная строка меняется
        System.out.println(stringBuilder);

        stringBuilder.append(" ").append("Hurra!");
        System.out.println(stringBuilder);

    }
}
