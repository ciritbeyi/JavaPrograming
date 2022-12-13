package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

    String word = "Level";
    String  reversed = "";  // temporary value

        for (int i = word.length()-1; i >=0 ; i--) {  // word.length()-1 => last index number
            reversed += word.charAt(i);  // in order to get the reverse of the word
        }
        System.out.println(reversed);  // leveL
       boolean isPalindrome = word.equalsIgnoreCase(reversed);  // equalsIgnoreCase ignores the case sensitivity
        System.out.println("isPalindrome = " + isPalindrome);  // isPalindrome = true

    }
}
/*
"Java" ==> "avaJ"   ===> false (not a palindrome)
"Anna" ==> "annA"   ===> true (a palindrome)
 */