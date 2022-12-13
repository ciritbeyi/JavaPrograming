package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
//  Z ~  A  : we want to print
    char [] alphabet = new char [26];  // icinde 26 karakter olan bir char array olusturduk.
    alphabet[0] = 'Z'; // 90
    alphabet[1] = 'Y'; // 89
    alphabet[2] = 'X'; // 88

// Solution 1:    in the loop 1 variable + outside the loop another variable
        char ch = 'Z';  // // ch : represents characters
        for (int i = 0 ; i < alphabet.length ; i++, ch--) {  // i : represents index number
            alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet));
        // print the whole array //[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]
        System.out.println(alphabet[0]);  // print the element of array  // Z
        System.out.println("--------------------------------------------------------------------------");
// Solution 2:  2 variable in the loop ( with char)
// we used char in the loop because variable name of the alphabet array is char
        for (char i = 0, j='Z'; i < alphabet.length  ; i++, j--) {  // i : represents index number, j represent character
            alphabet[i] = j;
        }
        System.out.println(Arrays.toString(alphabet));
        // print the whole array //[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]
        System.out.println("--------------------------------------------------------------------------");
// Solution 3:  2 variable in the loop ( with char)
        for (int i = 0, j='Z'; i < alphabet.length  ; i++, j--) {  // i : represents index number, j represent character
            alphabet[i] = (char)j;  // by adding (char)  we divert int j to char
        }
        System.out.println(Arrays.toString(alphabet));
        // print the whole array //[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]
// i: represents index numbers 0 ~ last index / j: represents the number of chars 'Z' ~ 'A'
// here i and j are both int because every letter has a number in ASCII
//  letters[i] = j;  // it is a compile error because letters is a char  => char [] alphabet = new char [26];


    }
}
