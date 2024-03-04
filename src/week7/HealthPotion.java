package week7;

import week4.Player;

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
        Weapon w1=new Weapon(4,5,6);
        System.out.println(hp1);
        System.out.println(w1);
    }
}
