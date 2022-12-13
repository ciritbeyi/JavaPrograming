package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        System.out.println("Enter a word:"); // "xcodeX"
        String str = new Scanner(System.in).next();  // if we are getting only one input from user
       // String str = "xcodeX";
        str = str.replace("x", "a") .replace("X" , "a");

        System.out.println("str = " + str);  //str = acodea


    }
}
