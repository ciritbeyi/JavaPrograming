package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];
     //   letters [0] = 'A';
    //    letters [1] = 'B';

        for (char i = 'A',j=0; i <= 'Z' && j <letters.length; i++, j++) { // i represents letters and j represents index numbers
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));  // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
        System.out.println("-------------------------------------------");
// i: represents index numbers 0 ~ last index / j: represents the number of chars 'A' ~ 'Z'
        // here i and j are both int because every letter has a number in ASCII
        for (int i = 0, j = 'A'; i < letters.length ; i++ , j++) {
          //  letters[i] = j;  // it is a compile error because letters is a char  => char [] letters = new char[26];
            letters[i] = (char)j; // by adding (char)  we divert int j to char
        }
        System.out.println(Arrays.toString(letters));  // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        System.out.println("-------------------------------------------");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {  // i represents letters
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));  //[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]

        System.out.println("-------------------------------------------");
        char ch1 = 'Z';
        for (int i = letters.length-1; i >=0 ; i--) {  // i represents letters
            letters[i] = ch1--;
        }
        System.out.println(Arrays.toString(letters));






    }
}
