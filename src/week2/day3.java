package week2;

import java.util.ArrayList;
import java.util.Random;

public class day3 {
    public static ArrayList<Integer> randArray(int size){
        ArrayList<Integer> out=new ArrayList<>();
        for (int x=0; x<size; x++){
            out.add((int)(Math.random()*101));
        }
        return out;
    }
    public static double average(ArrayList<Integer> nums){
        double out=0;
        for (int val : nums){
            out+=val;
        }
        out/=nums.size();
        return out;
    }
    /*
    1) write a static method that takes a size as a parameter and returns
    an arraylist that many elements each of which is a random number from 0-100
    2) write a method that averages the elements of a list like you created
    in part 1
    3) write a method that creates a hashmap of strings to integers of a size
    given by a parameter. string and ints should be random
    4) write a method that takes a hashmap and returns the key to the largest
    value
     */
    public static void main(String[] args) {
        ArrayList<Integer> result=randArray(2);
        System.out.println(result);
        double result2=average(result);
        System.out.println(result2);
    }
}
