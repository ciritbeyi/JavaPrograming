package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int [][] arr2D = { {1,2,3},{4,5,6} , {7,8,9} };

        // 3 dimensional array contains 2 dimensional arrays

        int [][][] arr3D = { { {1,2,3},{4,5,6} , {7,8,9} } , { {10,20,30},{40,50,60} , {70,80,90} }       };
  // index Num of 2DArrays                  0              ,             1
 // Index Num of 1DArrays       0        1           2            0          1             2
// Index Num of Elements      0 1 2     0 1 2     0 1 2         0 1 2      0 1 2        0 1 2

        System.out.println(Arrays.deepToString(arr3D));  // deepToString() is used to print 3DArray
  // [[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]

        System.out.println(Arrays.deepToString(arr3D[1]));  // deepToString() is used to print 2DArray
        //  [[10, 20, 30], [40, 50, 60], [70, 80, 90]]

        System.out.println(Arrays.toString(arr3D[1][1])); // toString() is used to print 1DArray
        //  [40, 50, 60]

        System.out.println(arr3D[0][2][2]);  // 9  // normal print for element

        for (int[][] each2DArray : arr3D) {
            for ( int [] each1DArray: each2DArray) {
                for ( int eachElement :each1DArray ) {
                    System.out.print(eachElement + " ");  // 1 2 3 4 5 6 7 8 9 10 20 30 40 50 60 70 80 90
                }
            }
        }

    }
}
