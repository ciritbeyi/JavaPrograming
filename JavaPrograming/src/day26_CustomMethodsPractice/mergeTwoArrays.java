package day26_CustomMethodsPractice;

import java.util.Arrays;

public class mergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {10,20,30,40};
        int [] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));  // [1, 2, 3, 4, 10, 20, 30, 40]



    } // main
    public static int[] merge( int[] arr1, int[] arr2){
        int [] result = new int[arr1.length+ arr2.length];
        int i = 0; // index number of result[]
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;

    }







} // class
