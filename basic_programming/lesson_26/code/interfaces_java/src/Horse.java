public class Horse extends Animal implements Moveable,Driveable{

  public void canMove(){
      System.out.println("Horse runs");
  }

  public void drive(){
      System.out.println("a horse can be driven by a rider");
  }


  public void sound(){
      System.out.println("Horse neighs");
  }
}
