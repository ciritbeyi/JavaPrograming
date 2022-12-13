package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word:"); // "xcodex"
        String word = new Scanner(System.in).next();  // if we are getting only one input from user

        if (word.charAt(0) == 'x') {
           word =  word.replaceFirst("x","a"); //"acodex"
        }
        System.out.println("word = " + word);  // word = acodex

    }
}
