package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int[] each1DArray : arr2D) {
            System.out.print(Arrays.toString(each1DArray)); // [1, 2, 3][4, 5, 6, 7][8, 9, 10, 11, 12]
        }
        System.out.println();
        for (int[] each1DArray : arr2D) { // Outer loop for 1DArray
            for ( int eachElement : each1DArray){ // Inner loop for element
                System.out.print(eachElement + " "); // 1 2 3 4 5 6 7 8 9 10 11 12
            }// Inner loop
        } // Outer loop



    }
}
