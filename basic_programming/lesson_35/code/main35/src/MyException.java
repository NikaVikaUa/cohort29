public class MyException extends Exception{

  public  String str;

  public MyException(String str){
      this.str = str;
  }

  public String toString(){
      return ("MyException occured:"+str);
  }
}
