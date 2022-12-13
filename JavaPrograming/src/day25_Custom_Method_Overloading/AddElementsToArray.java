package day25_Custom_Method_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};
       int[] newArr =  addIintiger(arr, 5);
        System.out.println(Arrays.toString(newArr));  // [1, 2, 3, 4, 5]
        System.out.println("-------------------------------------------------------");
        double[] arr1 = {1.5,2.5, 3.5, 4.5};
        double [] newArr2 = addDouble(arr1, 5.5);
        System.out.println(Arrays.toString(arr1));  // [1.5, 2.5, 3.5, 4.5]
        System.out.println("-------------------------------------------------------");
        String[] names = { "ediz", "Ali furkan", "Zeynep", "Zehra"};
         names = addString(names, "Yusuf ali");
        System.out.println(Arrays.toString(names)); // [ediz, Ali furkan, Zeynep, Zehra, Yusuf ali]
        names = addString(names, "ozgur");
        System.out.println(Arrays.toString(names)); // [ediz, Ali furkan, Zeynep, Zehra, Yusuf ali, ozgur]
        System.out.println("-------------------------------------------------------");
        char[] chars = {'A', 'B' , 'C', 'D'};
        chars = addChar(chars, 'E');
        System.out.println(Arrays.toString(chars));  // [A, B, C, D, E]





    }// main
//1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int [] addIintiger (int[] array, int element){
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
    public static double[] addDouble (double[] array , double element){
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
    public static String[] addString (String[] array , String element) {
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
    public static char[] addChar (char[] array , char element) {
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;
        return result;
    }
    
    
    
}// class

