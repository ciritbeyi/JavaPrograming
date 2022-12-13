package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));  // [1, 2, 3, 4, 5, 6, 7]

        String[] a1 = {"A", "B", "C"};
        String[] a2 = {"E", "F", "G"};

        String[] a3 = merge(a1,a2);
        System.out.println(Arrays.toString(a3));  // [A, B, C, E, F, G]




    }// main

   // merge the given two int arrays and returns the new array
    public static int[] merge( int[] arr1, int[] arr2){
        int [] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two double arrays and returns the new array
    public static double[] merge( double[] arr1, double[] arr2){
        double [] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two char arrays and returns the new array
    public static char[] merge( char[] arr1, char[] arr2){
        char [] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two String arrays and returns the new array
    public static String[] merge( String[] arr1, String[] arr2){
        String [] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }





} // class
