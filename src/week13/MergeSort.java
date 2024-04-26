package week13;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static ArrayList<Integer> splitArrayList(
            ArrayList<Integer> nums,int start,int end){
        ArrayList<Integer> out=new ArrayList<>();
        for (int i=start;i<end;i++){
            out.add(nums.get(i));
        }
        return out;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> left,
                                           ArrayList<Integer> right){
        ArrayList<Integer> sorted=new ArrayList<>();
        int leftPtr=0;
        int rightPtr=0;
        while(leftPtr<left.size() && rightPtr<right.size()){
            if (left.get(leftPtr)<right.get(rightPtr)){
                sorted.add(left.get(leftPtr));
                leftPtr++;
            } else {
                sorted.add(right.get(rightPtr));
                rightPtr++;
            }
        }
        while(leftPtr<left.size()){
            sorted.add(left.get(leftPtr));
            leftPtr++;
        }
        while(rightPtr<right.size()){
            sorted.add(right.get(rightPtr));
            rightPtr++;
        }
        return sorted;
    }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> numbers){
        if(numbers.size()<2){
            return numbers;
        } else {
            int mid=numbers.size()/2;
            ArrayList<Integer> left=splitArrayList(numbers,0,mid);
            ArrayList<Integer> right=splitArrayList(numbers,mid,numbers.size());
            ArrayList<Integer> leftSorted=mergeSort(left);
            ArrayList<Integer> rightSorted=mergeSort(right);
            return merge(leftSorted,rightSorted);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(
                Arrays.asList(3,4,8,7,9,9,1,2,5,3,8));
        ArrayList<Integer> sorted=mergeSort(numbers);
        System.out.println(sorted);
    }
}
