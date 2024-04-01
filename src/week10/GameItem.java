package week10;


public class GameItem {
    private double xLoc;
    private double yLoc;

    public GameItem(double xLoc,double yLoc){
        this.xLoc=xLoc;
        this.yLoc=yLoc;
    }
    public void use(Player player){}
    public void move(double dx,double dy){
        this.xLoc+=dx;
        this.yLoc+=dy;
    }
    @Override
    public String toString() {
        String out="("+this.xLoc+","+this.yLoc+")";
        return out;
    }
}
