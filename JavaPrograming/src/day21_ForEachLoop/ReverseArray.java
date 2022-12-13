package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};
/*
    { 40,30,20,10} we want this
     reversed[0] = numbers[3];
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[1];
 */

        int[] reversed = new int[numbers.length];  // we create another array which has the same capacity with numbers
        System.out.println(Arrays.toString(reversed));  // [0, 0, 0, 0, 0]
// i : index number of elements in array numbers  => i must increase
// j : index number of elements in array reversed  => j must decrease
        for (int i = numbers.length - 1, j = 0 ; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
