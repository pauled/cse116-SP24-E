package week4;

import java.util.ArrayList;

public class Party {
    private int battlesWon;
    private ArrayList<Character> members;

    public Party(){
        this.battlesWon=0;
        this.members=new ArrayList<>();
    }
    public void addMembers(Character newMember){
        this.members.add(newMember);
    }
    public void winBattle(int xp){
        this.battlesWon++;
        for (int x=0;x<this.members.size(); x++){
            this.members.get(x).winBattles(xp);
        }
    }
}
