package week12.brainOrig;

public class Panic extends MentalState{
    public Panic(){
    }
    public MentalState study(){
        return new Calm();
    }
    public MentalState getCloserToExam(){
        System.out.println("all my drinks are shaken not stirred");
        return this;
    }
    public MentalState expressFeelings(){
        System.out.println("I AM FREAKING OUT MAN!");
        return this;
    }
}
