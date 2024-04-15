package week12;

public class ProfessorHulk implements State{
    private BruceBanner banner;
    public ProfessorHulk(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        System.out.println("no problem");
    }
    public void calmDown(){
        System.out.println("Alerady calm");
    }
    public void useCar(Car car){
        car.drive(true);
    }
    public void fight(){
        System.out.println("smash carefully");
    }

}
