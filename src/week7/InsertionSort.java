package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort <T>{
    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator){
        this.comparator=comparator;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();
        for (T valueToInsert : input){
            int location = 0;
            for (T valueToCompare : output) {
                if (comparator.compare(valueToCompare,valueToInsert)) {
                    location++;
                }
            }
            output.add(location,valueToInsert);
        }
        return  output;
    }

    public static void main(String[] args) {
        InsertionSort<Integer> sorter=new InsertionSort<>(new IntDecreasing());
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);

        InsertionSort<Double> sorter2=new InsertionSort<>(new DoubleIncreasing());
        ArrayList<Double> list2=new ArrayList<>(Arrays.asList(1.0,6.0,5.0));
        ArrayList<Double> output2=sorter2.sort(list2);
        System.out.println(output2);
    }
}
