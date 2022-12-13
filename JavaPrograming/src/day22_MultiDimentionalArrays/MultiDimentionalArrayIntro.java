package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiDimentionalArrayIntro {
    public static void main(String[] args) {

        String [] group1 = {"Ozgur", "Ali", "Kenan"};
        String [] group2 = {"Zeynep", "Zehra", "Hatice"};
        String [] group3 = {"Ediz", "Furkan", "Yusuf Ali"};

        String [][] groups = new String[3][];  // index : 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups));  // it will give a Hash code.
        // toString() is for one dimensional arrays
        // [[Ljava.lang.String;@27f674d, [Ljava.lang.String;@1d251891, [Ljava.lang.String;@48140564]

        System.out.println(Arrays.deepToString(groups));
        //[[Ozgur, Ali, Kenan], [Zeynep, Zehra, Hatice], [Ediz, Furkan, Yusuf Ali]]

        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        System.out.println(Arrays.toString(arr2D[1])); // [4, 5, 6, 7]

        System.out.println(arr2D[1][2]); //  6

        for ( int i =0; i < arr2D.length; i++) {  // i : index number of single dimensional arrays
            System.out.print(Arrays.toString(arr2D[i]) + " "); // [1, 2, 3] [4, 5, 6, 7] [8, 9, 10, 11, 12]
        }
        System.out.println();

        for ( int i =0; i < arr2D.length; i++) {  // Outer loop i : index number of single dimensional arrays
            for (int j = 0 ; j < arr2D[i].length ; j++) {  // inner loop j: index numbers of elements
               System.out.print( arr2D[i][j] + " ");  // 1 2 3 4 5 6 7 8 9 10 11 12
            } // Inner loop closing
        } // Outer loop closing


    }
}
