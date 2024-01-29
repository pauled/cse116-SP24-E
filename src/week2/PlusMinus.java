package week2;

public class PlusMinus {
    public static String letter(int score){
        if (score>=90){
            return "A";
        } else if(score>=80){
            return "B";
        } else if(score>=70){
            return "C";
        } else if(score>=60){
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println("letter(93) should be A got "+letter(93));
        System.out.println("letter(103) should be A got "+letter(103));
        System.out.println("letter(90) should be A got "+letter(90));
        System.out.println("letter(89) should be B got "+letter(89));
        System.out.println("letter(70) should be C got "+letter(70));
        System.out.println("letter(3) should be F got "+letter(3));

        double val=5;
        while (val>0){
            System.out.println(val);
            val-=1;
            System.out.println("still in loop");
        }
        int x=13;
        System.out.println("val after loop: "+val);
        for (x=0;x<5;x++){
            int y=10;
            System.out.println(x);
        }
        System.out.println(x);
        int y=1;
    }
}
