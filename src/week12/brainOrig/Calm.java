package week12.brainOrig;

public class Calm extends MentalState{
    public Calm(){
    }
    public MentalState study(){
        System.out.println("remaining calm and not paniced");
        return this;
    }
    public MentalState getCloserToExam(){
        return new Panic();
    }
    public MentalState expressFeelings(){
        System.out.println("I am a leaf on the wind");
        return this;
    }
}
