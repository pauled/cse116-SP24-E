package week4;

public class Player {
    private int maxHP;
    private int HP;
    private int damageDealt;

    public Player(int maxHP){
        this.HP=maxHP;
        this.maxHP=maxHP;
        this.damageDealt=4;
    }
    public int getMaxHP(){
        return this.maxHP;
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
    public static void main(String[] args) {
        Player p1=new Player(10);
        Player p2=new Player(12);
        int temp=p1.getMaxHP();
        //int temp2=p2.getMaxHP();
        p1.attack(p2);
    }
}
