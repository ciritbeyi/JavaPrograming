package day27_Wrapper_Classes;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,4,4,4,4};
        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr)); //


        String[] arr2 ={ "Ozgur", "Ozgur", "Ali", "Ali", "Ali","Kenan", "Serife"};
        arr2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));



    }// main

    // removes the duplicates from the given array, returns the new array
    public  static int[] removeDuplicates(int[]array){
        int[] array1 = {};  // temp

        for (int each : array) {
            if ( ! ArraysUtility.contains(array1,each)) { // we are eliminating the duplicated elements
                ArraysUtility.addElement(array1,each);
            }
        }
        return array1;
    }






    // removes the duplicates from the given array, returns the new array
    public  static String[] removeDuplicates(String[]array){
        String[] array1 = {};  // temp

        for (String each : array) {
            if ( ! ArraysUtility.contains(array1,each)) { // we are eliminating the duplicated elements
                ArraysUtility.addElement(array1,each);
            }
        }
        return array1;
    }







}// class
