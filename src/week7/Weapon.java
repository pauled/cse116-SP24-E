package week7;


public class Weapon extends GameItem{
    private int damage;

    public Weapon(double xLoc,double yLoc,int damage){
        super(xLoc,yLoc);
        this.damage=damage;
    }
    public void use(Player player){
        player.takeDamage(this.damage);
    }
}
