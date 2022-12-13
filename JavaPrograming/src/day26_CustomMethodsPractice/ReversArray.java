package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));  // [5, 4, 3, 2, 1]




    }// main

    // reverses the given int array, returns a new array
    public static int[] reverse ( int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j =0 ; i >= 0; i--, j++) { // i: index num of array / j: index number of result
            result[j] = array[i];
        }
        return result;
    }

    // reverses the given double array, returns a new array
    public static double[] reverse ( double[] array) {
        double[] result = new double[array.length];
        for (int i = array.length - 1, j =0 ; i >= 0; i--, j++) { // i: index num of array / j: index number of result
            result[j] = array[i];
        }
        return result;
    }

    // reverses the given char array, returns a new array
    public static char[] reverse ( char[] array) {
        char[] result = new char[array.length];
        for (int i = array.length - 1, j =0 ; i >= 0; i--, j++) { // i: index num of array / j: index number of result
            result[j] = array[i];
        }
        return result;
    }

    // reverses the given String array, returns a new array
    public static String[] reverse ( String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // i: index num of array / j: index number of result
            result[j] = array[i];
        }
        return result;
    }




} // class
