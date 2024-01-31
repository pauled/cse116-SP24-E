package week2;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList1 {
    public static int sum(ArrayList<Integer> arrIn){
        int total=0;
        for (int x=0;x<arrIn.size(); x++){
            total+=arrIn.get(x);
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0; x<4; x++){
            arr1.add(x*x);
        }
        System.out.println(arr1);
        int temp=sum(arr1);
        System.out.println(temp);

        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Knox",86);
        bills.put("Diggs",14);
        for (String keys : bills.keySet()){
            System.out.println(keys);
        }
        for (Integer values: bills.values()){
            System.out.println(values);
        }
        for (String keys : bills.keySet()){
            System.out.println(keys+" num: "+bills.get(keys));
        }
    }
}
