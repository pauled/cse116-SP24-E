package week7;

public class Player extends GameItem{
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
        super(0,0);
        this.HP=maxHP;
        this.maxHP=maxHP;
        this.damageDealt=4;
    }
    public int getMaxHP(){
        return this.maxHP;
    }
    public int getHP(){
        return this.HP;
    }
    public int getDamageDealt(){
        return this.damageDealt;
    }
    public void setHP(int newHP){
        this.HP=newHP;
    }
    public void takeDamage(int damage){
        this.HP-=damage;
    }
    public void attack(Player otherPlayer){
        otherPlayer.takeDamage(this.damageDealt);
    }
    public String toString(){
        String out="Health "+this.HP+"/"+this.maxHP;
        out+=" damage dealth: "+this.damageDealt;
        out+=" location: "+super.toString();
        return out;
    }
    public boolean equals(Player other) {
        // If the object is compared with itself then return true
        if (other.getDamageDealt() != this.getDamageDealt()) {
            return false;
        } else if(other.getHP() != this.getHP()) {
            return false;
        } else if(other.getMaxHP() != this.getMaxHP()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(12);
        int temp=p1.getMaxHP();
        //int temp2=p2.getMaxHP();
        p1.attack(p2);
        System.out.println("p2: "+p2);
        System.out.println("p1: "+p1.toString());
    }
}
