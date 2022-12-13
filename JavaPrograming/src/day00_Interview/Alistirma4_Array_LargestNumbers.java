package day00_Interview;

public class Alistirma4_Array_LargestNumbers {

    public static void main(String[] args) {
//   Q1: Largest and Smallest Number
        int [] array = {10, 4, 3, 50, 23, 90};
        largestAndSmallest(array);

//Q2: Largest Three Numbers
        largestThree(array);





    }//main
//   Q1: Largest and Smallest Number

    public static void largestAndSmallest(int [] array){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest){
                largest = array[i];
            } else if (array[i] <smallest) {
                smallest = array[i];
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
    }

    //Q2: Largest Three Numbers
    public static void largestThree(int[] array){

        int l1 = array[0];
        int l2 = array[0];
        int l3 = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > l1){
                l3 = l2;
                l2 = l1;
                l1 = array[i];
            } else if (array[i] > l2) {
                l3 = l2;
                l2 = array[i];
            } else if (array[i] > l3){
                l3 = array [i];
            }
        }

        System.out.println(l1 + " - " + l2 + " - " + l3);
    }










} // class
