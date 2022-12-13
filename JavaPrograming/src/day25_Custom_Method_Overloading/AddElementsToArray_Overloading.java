package day25_Custom_Method_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4};  //5
        numbers =  addElement(numbers,5);

        double[] arr1 = {1.5,2.5, 3.5, 4.5};  // 7.5
        arr1 = addElement(arr1, 7.5);

        String[] names = { "ediz", "Ali furkan", "Zeynep", "Zehra"};  // "ozgur"
        names = addElement(names, "ozgur");

        char[] chars = {'A', 'B' , 'C', 'D'};  // 'E'
        chars = addElement(chars, 'E');

        System.out.println("numbers = " + Arrays.toString(numbers));  // numbers = [1, 2, 3, 4, 5]
        System.out.println("arr1 = " + Arrays.toString(arr1));   // arr1 = [1.5, 2.5, 3.5, 4.5, 7.5]
        System.out.println("names = " + Arrays.toString(names));  //  names = [ediz, Ali furkan, Zeynep, Zehra, ozgur]
        System.out.println("chars = " + Arrays.toString(chars));  // chars = [A, B, C, D, E]

    }

    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int [] addElement (int[] array, int element){
        int[] result = new int [array.length+1];
        int i = 0; // index number of result[]
        for (int each : array) {  //  to get the elements of array[]
            result[i] = each;
            i++;
        }
        result[i] = element; // to add the element
        return result;
    }
    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement (double[] array , double element){
        double [] result = new double[array.length+1];
        int i = 0;
        for (double each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;

        return result;

    }
    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement (String[] array , String element) {
        String[] result = new String[array.length+1];
        int i = 0;
        for (String each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;
        return result;
    }
    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement (char[] array , char element) {
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;
        return result;
    }


}
