package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
// write a program that can check if str1 & str2 are build out same characters

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        boolean result = Arrays.equals(ch1,ch2);

        System.out.println(result);  // true
        System.out.println("----------------------");

        String sentence = "I love learning java programming language";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));// [I, love, learning, java, programming, language]
        System.out.println("----------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] name1 = email.split("@");
        System.out.println(Arrays.toString(name1));  // [WoodenSpoon, cydeo.com]
        System.out.println("----------------------");

        String s = "Today is a nice day. Today is Monday. Today we learn Java";
        String[] res = s.split("\\. "); // .  yi \\ ile yazmak zorundayiz
        System.out.println(Arrays.toString(res)); //[Today is a nice day, Today is Monday, Today we learn Java]



    }
}
