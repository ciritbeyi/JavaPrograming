package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer each : list) {
            int freq = Collections.frequency(list,each); // finds the freq of each element
            if (freq == 1){
                uniqueList.add(each);
            }
        }
        System.out.println("uniqueList = " + uniqueList); // uniqueList = [2, 4, 6, 8]
        System.out.println("-------------Second Solution ----------------");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf(p-> Collections.frequency(unique2,p) >1); // remove non unique elements
        System.out.println("unique2 = " + unique2);  // unique2 = [2, 4, 6, 8]


    }
}
