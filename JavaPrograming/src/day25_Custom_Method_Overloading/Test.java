package day25_Custom_Method_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programing Language";

        StringUtility.printEachChar(str);
        System.out.println("------------------------");
        String s1 = "Wooden Spoon";
        System.out.println(StringUtility.reverse(str));
        System.out.println(StringUtility.reverse(s1));
        System.out.println("------------------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome); // palindrome = true
        System.out.println("------------------------");

        String[] names = { "Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each) == true){
                count++;
            }
        }
        System.out.println("In this array " + count + " words are palindrome");
        System.out.println("------------------------");

        String w1 = "ediz";
        String w2 = "ezid";
        System.out.println(StringUtility.isAnagram(w1, w2));
        System.out.println("------------------------");

        String word1 = "aaaabbbbcccc";
        String removed = StringUtility.removeDuplicate(word1);
        System.out.println("removed = " + removed);


    }
}
