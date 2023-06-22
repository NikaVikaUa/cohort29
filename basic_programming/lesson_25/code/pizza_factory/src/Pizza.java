public abstract class Pizza {

    private String type; //  тип пиццы

    public Pizza( String type){
        this.type = type;
    }

  abstract void prepare();

  void bake()  {
      System.out.println("Baking "+type);
  }

  void pack(){
      System.out.println("Packing "+type);
  }


}
