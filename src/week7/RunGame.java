package week7;

public class RunGame {
    public static void main(String[] args) {
        Weapon w1=new Weapon(4,5,6);
        Player p1=new Player(10);
        p1.move(13,42);
        w1.use(p1);
        System.out.println(p1);
    }
}
