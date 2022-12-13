package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[]array = {1,1,2,3,3,4,5,5,6,7,7};
        int[] unique = uniqueElement(array);
        System.out.println(Arrays.toString(unique));  // [2, 4, 6]

        double[] array2 = {1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};
        double[] unique2 = uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));  // [2.5, 3.5]


    } // main
// returns the unique elements of the int  array as a new int array
    public static int[] uniqueElement(int[] array) {
        int[] result = {}; // it is a temp array with 1 size => new int[0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // we verify that element is unique
                result = ArraysUtility.addElement(result, each); // we add the unique one to the result[]
                // it creates a new array, does not add the inside temp one
            }
        }
        return result;
    }

    // returns the unique elements of the double  array as a new double array
    public static double[] uniqueElement(double[] array) {
        double[] result = {}; // it is a temp array with 1 size => new int[0]
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // we verify that element is unique
                result = ArraysUtility.addElement(result, each); // we add the unique one to the result[]
                // it creates a new array, does not add the inside temp one
            }
        }
        return result;
    }

    // returns the unique elements of the char  array as a new char array
    public static char[] uniqueElement(char[] array) {
        char[] result = {}; // it is a temp array with 1 size => new int[0]
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // we verify that element is unique
                result = ArraysUtility.addElement(result, each); // we add the unique one to the result[]
                // it creates a new array, does not add the inside temp one
            }
        }
        return result;
    }


    // returns the unique elements of the String  array as a new String array
    public static String[] uniqueElement(String[] array) {
        String[] result = {}; // it is a temp array with 1 size => new int[0]
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // we verify that element is unique
                result = ArraysUtility.addElement(result, each); // we add the unique one to the result[]
                // it creates a new array, does not add the inside temp one
            }
        }
        return result;
    }





} // class
