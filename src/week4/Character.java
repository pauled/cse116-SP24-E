package week4;

public class Character {
    private int battlesWon;
    private int expPts;

    public Character(){
        this.battlesWon=0;
        this.expPts=0;
    }
    public void winBattles(int xp){
        this.battlesWon++;
        this.expPts+=xp;
    }
}
