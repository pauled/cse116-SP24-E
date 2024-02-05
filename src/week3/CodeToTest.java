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
    }
}
