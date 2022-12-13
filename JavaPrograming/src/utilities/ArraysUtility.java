package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // prints each double of an double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char of an char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    // prints each String of an char String in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    // returns the maximum number from an integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the maximum number from an double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //   returns the minimum number from an integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // returns the minimum number from an double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // checks if the given integer is contained in the given array. returns boolean.   contains(int[], int)
    public static boolean contains(int[] array, int element) {  //   {1,2,3,4,5} ,  6
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given array. returns boolean.   contains(double[], double)
    public static boolean contains(double[] array, double element) {  //   {1,2,3,4,5} ,  6
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given array. returns boolean.   contains(char[], char)
    public static boolean contains(char[] array, char element) {  //   {1,2,3,4,5} ,  6
        boolean result = false;
        for (char each : array) {
            if (each == element) { // if any arrays element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given array. returns boolean.   contains(String[], String)
    public static boolean contains(String[] array, String element) {  //   {1,2,3,4,5} ,  6
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    // adds the given integer element to an integer array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0; // index number of result[]
        for (int each : array) {  //  to get the elements of array[]
            result[i] = each;
            i++;
        }
        result[i] = element; // to add the element
        return result;


        // merger
        // addElements
        // removeElements
        // reverse
        // frequencyOfElement
        // uniqueElement
        // removeDuplicates


    }

    //adds the given double element to a double array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;

        return result;
    }

    // adds the given String element to a String array, returns a new array
    public static String[] addElement (String[] array , String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;
        return result;
    }

    // adds the given char element to a char array, returns a new array
    public static char[] addElement (char[] array , char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i] = each;
            i++;
        }
        result[i] = element;
        return result;
    }

    // returns the frequency of the given int element in the given int array
    public static int frequencyOfElement (int []array , int element){
        int count = 0;
        for (int each : array ) {
            if ( each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given double element in the given double array
    public static int frequencyOfElement (double []array , double element){
        int count = 0;
        for (double each : array ) {
            if ( each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given char element in the given char array
    public static int frequencyOfElement (char []array , char element){
        int count = 0;
        for (char each : array ) {
            if ( each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given String element in the given String array
    public static int frequencyOfElement (String []array , String element){
        int count = 0;
        for (String each : array ) {
            if ( each.equals(element)) {
                count++;
            }
        }
        return count;
    }

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

    // replace the element of the int array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){
        if (index< 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace the element of the double array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){
        if (index< 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace the element of the char array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){
        if (index< 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace the element of the String array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){
        if (index< 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replaces  all the matching old value with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces  all the matching old value with new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces  all the matching old value with new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces  all the matching old value with new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue) ){
                array[i] = newValue;
            }
        }
        return array;
    }




    //insert: arr = {1,2,3,4,5}   insert(arr,2,40)   => {1,2,40,3,4,5}

// toplam 44 oldu

// removeDuplicates








} // end of class