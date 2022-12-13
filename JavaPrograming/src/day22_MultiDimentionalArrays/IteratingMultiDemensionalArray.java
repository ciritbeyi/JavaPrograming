package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class IteratingMultiDemensionalArray {
    public static void main(String[] args) {

        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int i = arr2D.length - 1; i >= 0; i--) {  //i:  index number of 1D arrays starting from last index to 0
            System.out.println(Arrays.toString(arr2D[i]));

            }
        System.out.println("------------------------------------------");
        for (int i = arr2D.length-1; i >= 0 ; i--) {  // Outer loop i:  index number of 1D arrays starting from last index to 0
            for (int j = 0; j < arr2D[i].length; j++) {  // Inner loop j : index number of elements starting from last index to 0
                System.out.print(arr2D[i][j] + " " );
            } // Inner loop
            System.out.println();  // bunu koymaz isek tek satirda yazar // 8 9 10 11 12 4 5 6 7 1 2 3
        }// Outer loop
/*
 System.out.println(); bu koyunca boyle yazar.
 Task 1:
8 9 10 11 12
4 5 6 7
1 2 3
 */
        System.out.println("------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) { // Outer loop i:  index number of 1D arrays starting from 0 to last index
            for (int j = arr2D[i].length-1; j >=0 ; j--) {  // Inner loop  j : index number of elements starting from index number 0
                System.out.print(arr2D[i][j] + " ");
            } // Inner loop
            System.out.println();
        } // Outer loop
/*
 System.out.println(); bu koyunca boyle yazar.
3 2 1
7 6 5 4
12 11 10 9 8
 */
        System.out.println("------------------------------------------");
        for (int i = arr2D.length-1; i >= 0 ; i--) {  // Outer loop i:  index number of 1D arrays starting from last index to 0
            for (int j = arr2D[i].length-1; j >=0 ; j--) {  // Inner loop  j : index number of elements starting from index number 0
                System.out.print(arr2D[i][j] + " ");
            } // Inner loop
            System.out.println();
        } // Outer loop
/*
12 11 10 9 8
7 6 5 4
3 2 1
 */
    }
}
