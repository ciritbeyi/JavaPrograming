package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

    String[] group1 = {"Ozgur", "Ali" , "Kenan", "Muzeyyen", "Hatice"};
    String[] group2 = {"Zeynep", "Ali Furkan" , "Ediz", "Zehra", "Yusuf Ali"};

    String [] group3 = new String[group1.length+group2.length];  // we create an array which has enough capacity

        int i = 0;  // i: index number of group3's elements
        for (String each : group1) { // to get the elements of group1
            group3[i++] = each;
        }
        System.out.println(Arrays.toString(group3)); //[Ozgur, Ali, Kenan, Muzeyyen, Hatice, null, null, null, null, null]

        for (String each : group2) {  // to get the elements of group2
            group3[i++] = each;
        }
        System.out.println(Arrays.toString(group3));
        //[Ozgur, Ali, Kenan, Muzeyyen, Hatice, Zeynep, Ali Furkan, Ediz, Zehra, Yusuf Ali]

        System.out.println("------------------------------------");

        char[] ch1 = {'A', 'B','C' };
        char[] ch2 = {'A', 'B','C','D','E', 'F','G' };

        char[] ch3 = new char[ch1.length+ch2.length];

        int j = 0;

        for (char each : ch1) {
            ch3[j++] = each;
        }
        for (char each : ch2) {
            ch3[j++] = each;
        }
        System.out.println(Arrays.toString(ch3));  //[A, B, C, A, B, C, D, E, F, G]

    }
}
/*
Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */
