public class Player implements Comparable<Player>{

    private int ranking;
    private String name;
    private int age;

    public Player( int ranking, String name, int age){
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


  /*  public int compareTo(Player p){
        if( getRanking() - p.getRanking() > 0){
            return 1;
        }else if ( getRanking() - p.getRanking() < 0){
            return  -1;
        }else return 0;
    }*/

    // более короткая форма записи
 //   public int compareTo(Player p){
 //       return getRanking() -p.getRanking();
 //   }

 //   public int compareTo(Player p){
 //       return Integer.compare(getRanking(),p.getRanking());
 //   }
   // сравнение по имени с использованием метода compareTo  класса String
 //   public int compareTo(Player p){
 //              return getName().compareTo(p.getName());
 //          }

    // метод compareTo  для сортировки по имени, а если имена одинаковые, то по возрасту
    public int compareTo(Player p){
        int playerName = getName().compareTo(p.getName());// сравнение имен
        return playerName == 0 ? Integer.compare(getAge(),p.getAge()) : playerName; // сравнение по возрасту если
        // имена одинаковые
   //     if(playerName == 0){
   //         return Integer.compare(getAge(),p.getAge())
   //     } else return playerName;

    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
