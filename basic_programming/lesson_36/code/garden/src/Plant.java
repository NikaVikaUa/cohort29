public abstract class Plant implements Comparable<Plant> {

    private String displayName;
    private int height;
    private int age;


    public Plant(String displayName, int height, int age) {
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void addYearToAge(){
        this.age++;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract int getGrowPerSeason();// рост за сезон

    public void doSpring(){
        addYearToAge(); // новый год начинается весной для растений
        setHeight(getHeight()+getGrowPerSeason());// старая высота + рост за сезон
        System.out.println(getDisplayName()+" has grown in Spring  "+getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter(){
        System.out.println(getDisplayName()+" is not growing in Winter  "+getHeight());
    }

    public int compareTo( Plant plant){
        return getDisplayName().compareTo(plant.getDisplayName());
    }
}
