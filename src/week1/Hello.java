package week1;

public class Hello {
    public static double multiplyByTwo(double x){
        double x2=2*x;
        return x2;
    }
    public static void main(String[] args) {
        System.out.println("Hello Nurse!");
        int x=5;
        double num2=3.14;
        String str1="I am a string";
        str1="$$$";
        boolean bool1=true;
        x=4/6;
        System.out.println(x);
        num2=multiplyByTwo(3.0);
        System.out.println(num2);
    }
}