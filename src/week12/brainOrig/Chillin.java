package week12.brainOrig;

public class Chillin extends MentalState{
    public Chillin(){
    }
    public MentalState study(){
        System.out.println("I am such a good student that I still study");
        return this;
    }
    public MentalState getCloserToExam(){
        System.out.println("I am so good I take exams even when I'm done");
        return this;
    }
    public MentalState expressFeelings(){
        System.out.println("I am done");
        return this;
    }
}
