package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500,600};
       int[] result =  removeElements(numbers, 1);
        System.out.println(Arrays.toString(result));  // [100, 300, 400, 500, 600]




    } // main

    // remove the int element which is at the given index number from en int array, returns a new array
    public static int[] removeElements(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0); // exits the program
        }

        int[] result = new int[array.length-1]; // result,length = array.length-1
        int j = 0;  // j : is the index number of result array
        for (int i = 0; i < array.length; i++) {  // to acsses the index number of array
            if (i == index) { // if the index of array is matching with the element in given index
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // remove the double element which is at the given index number from en double array, returns a new array
    public static double[] removeElements(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0); // exits the program
        }

        double[] result = new double[array.length-1]; // result,length = array.length-1
        int j = 0;  // j : is the index number of result array
        for (int i = 0; i < array.length; i++) {  // to acsses the index number of array
            if (i == index) { // if the index of array is matching with the element in given index
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // remove the char element which is at the given index number from en char array, returns a new array
    public static char[] removeElements(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0); // exits the program
        }

        char[] result = new char[array.length-1]; // result,length = array.length-1
        int j = 0;  // j : is the index number of result array
        for (int i = 0; i < array.length; i++) {  // to acsses the index number of array
            if (i == index) { // if the index of array is matching with the element in given index
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // remove the String element which is at the given index number from en String array, returns a new array
    public static String[] removeElements(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0); // exits the program
        }

        String[] result = new String[array.length-1]; // result,length = array.length-1
        int j = 0;  // j : is the index number of result array
        for (int i = 0; i < array.length; i++) {  // to acsses the index number of array
            if (i == index) { // if the index of array is matching with the element in given index
                continue;  // skip
            }
            result[j++] = array[i];
        }
        return result;
    }












} // classs
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array




 */