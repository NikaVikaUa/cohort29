public class Drawing implements Drawable{
    String string = "Picture";



    @Override
    public void draw() {
        System.out.println("I can draw a "+string);
    }
}
