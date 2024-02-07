package week3;


import org.junit.Test;
public class CodeToTest {
    public static int add(int a,int b){
        return a+Math.abs(b);
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(0,5));
        System.out.println(add(-5,8));
        String a="hello ";
        String b="goodbye";
        String c=a+b;
        System.out.println(c);
        System.out.println(c=="hello goodbye");
        System.out.println(c.equals("hello goodbye"));
    }
}
