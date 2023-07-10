public class Tree extends Plant{

    private final static int TREE_GROWW_PER_SEASON = 5; // рост дерева за сезон

    public Tree( String displayName, int height, int age){
        super(displayName,height,age);
    }

    public void doSummer(){
        setHeight(getHeight() + getGrowPerSeason()); //  высота = старая высота + рост за сезон
        System.out.println(getDisplayName()+" has grown in Summer  "+getHeight());
    }

    public void doAutumn(){
        System.out.println(getDisplayName()+" is not growing in Autumn  "+getHeight());
    }

    public int getGrowPerSeason(){
        return TREE_GROWW_PER_SEASON;
    }
}
