package week7;


public class HealthPotion extends GameItem{
    private int increase;

    public HealthPotion(double xLoc,double yLoc,int increase ){
        super(xLoc,yLoc);
        this.increase=increase;
    }
    public void use(Player player1){
        player1.takeDamage(-this.increase);
    }

    @Override
    public String toString() {
        return "increase: "+this.increase+" "+super.toString();
    }

    public static void main(String[] args) {
        HealthPotion hp1=new HealthPotion(1,2,3);
        //
        Weapon w1=new Weapon(4,5,6);
        Player p1=new Player(10);
        p1.move(13,42);
        w1.use(p1);
        System.out.println(p1);
        //
        hp1.move(10,10);
        System.out.println(hp1);
        System.out.println(w1);

        System.out.println(p1);
        w1.use(p1);
        p1.move(13,42);
        System.out.println(p1);
    }
}
