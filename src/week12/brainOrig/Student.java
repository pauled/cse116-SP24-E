package week12.brainOrig;

public class Student {
    private MentalState state;

    public Student(){
        this.state=new Calm();
    }
    public void setState(MentalState state){
        this.state=state;
    }
    public void study(){
        this.state=this.state.study();
    }
    public void getCloserToExam(){
        this.state=this.state.getCloserToExam();
    }
    public void expressFeelings(){
        this.state=this.state.expressFeelings();
    }
    public void passClass(){
        this.state=new Chillin(this);
    }

    public static void main(String[] args) {
        Student jesse=new Student();
        jesse.study();
        jesse.getCloserToExam();
        jesse.getCloserToExam();
        jesse.expressFeelings();
        jesse.study();
        jesse.expressFeelings();
        jesse.passClass();
        jesse.expressFeelings();
    }
}
