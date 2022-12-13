package day00_Interview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();

        String wordReversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            wordReversed += word.charAt(i);
        }
        if ( word.equals(wordReversed)){
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is NOT Palindrome");
        }






    }
}
