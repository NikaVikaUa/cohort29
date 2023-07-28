public class Main {
    public static void main(String[] args) {
      //  for(int i=1;i<=43;i++)
         //   System.out.println(i%10);

        int x = 1;
        int y = x++;
    //    System.out.println("y= "+y);
    //    System.out.println("x= "+x);

        x = 1;
         y = ++x;
    //    System.out.println("y= "+y);
    //    System.out.println("x= "+x);

        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"b");
        newMap.put(1,"c");


        System.out.println("size is "+newMap.size());
        System.out.println("get1 is"+newMap.get(1));
        System.out.println("get2 is"+newMap.get(2));
        System.out.println("get3 is"+newMap.get(3));

        System.out.println("remove key 1"+newMap.remove(1));
        System.out.println("remove key 8"+newMap.remove(8));

        System.out.println("map contains key 1 "+newMap.contains(1));
        System.out.println("get 1 ="+newMap.get(1));
        System.out.println("get 3 ="+newMap.get(3));

    }
}
