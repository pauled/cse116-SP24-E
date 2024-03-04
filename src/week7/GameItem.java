package week7;

import week4.Player;

public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc,double yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public void use(Player player){}

    @Override
    public String toString() {
        String out="x: "+this.xLoc+" y: "+this.yLoc;
        return out;
    }
}
