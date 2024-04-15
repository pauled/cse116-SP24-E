package week12;

public class DrBanner implements State{
    private BruceBanner banner;
    public DrBanner(BruceBanner banner){
        this.banner=banner;
    }
    public void makeAngry(){
        banner.setState(new TheHulk(banner));
    }
    public void calmDown(){
        System.out.println("Alerady calm");
    }
    public void useCar(Car car){
        car.drive(false);
    }
    public void fight(){
        System.out.println("splatter");
    }
}
