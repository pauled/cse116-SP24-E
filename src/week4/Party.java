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
    public String toString(){
        String out="battles won: "+this.battlesWon;
        out+="\nmembers: \n";
        for (int x=0;x<this.members.size(); x++){
            out+=" "+this.members.get(x)+"\n";
        }
        return out;
    }
    public static void main(String[] args) {
        Character hero=new Character();
        Character hero2=new Character();
        hero.winBattles(10);
        Party party=new Party();
        party.addMembers(hero);
        party.addMembers(hero2);
        party.winBattle(20);
        System.out.println(party);
    }
}
