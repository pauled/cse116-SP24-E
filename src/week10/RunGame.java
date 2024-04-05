package week10;

public class RunGame {
    public static void main(String[] args) {
        Weapon w1=new Weapon(4,5,6);
        //w1.enhance();
        GameItem w2=w1;
        GameItem w4=new Weapon(4,5,6);
        Usable w5=new Weapon(4,5,6);
        Object o1=w2;
        //w2.enhance();
        Weapon w3=(Weapon)w2;
        //HealthPotion h1=(HealthPotion)w2; bad
        w3.enhance();
        System.out.println(w1);
        System.out.println(w2);
        Player p1=new Player(10);
        p1.move(13,42);
        w1.use(p1);
        //h1.use(p1);
        System.out.println(p1);
    }
}
