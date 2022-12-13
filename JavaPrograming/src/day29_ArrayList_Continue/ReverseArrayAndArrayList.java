package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
 // reverse an array
        int[] array = {1,2,3,4,5,6};
        int [] result = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {
            result [j] = array[i]; // i: index number of array , j: index number of result
        }
        System.out.println(Arrays.toString(result));  // [6, 5, 4, 3, 2, 1]

 // reverse an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList = new ArrayList<>(); // we will write in reversedList

        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);
        }
        System.out.println("reversedList = " + reversedList);  //reversedList = [8, 7, 6, 5, 4, 3, 2, 1]


        
    }
}
