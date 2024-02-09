package week3;

public class FirstRecursion {
    public static int add(int a, int b){
        if (b==0){
            return a;
        } else if (b>0){
            int temp= add(a+1,b-1);
            return temp;
        } else {
            int temp= add(a-1,b+1);
            return temp;
        }
    }
    public static int fib(int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int result=add(3,4);
        System.out.println("result: "+result);
    }
}
