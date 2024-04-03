package week10;


public class Weapon extends GameItem implements Usable{
    private int damage;

    public Weapon(double xLoc,double yLoc,int damage){
        super(xLoc,yLoc);
        this.damage=damage;
    }
    public void use(Player player){
        player.takeDamage(this.damage);
    }
    public void enhance(){
        this.damage*=2;
    }

    @Override
    public String toString() {
        return super.toString()+" damage: "+this.damage;
    }

}
