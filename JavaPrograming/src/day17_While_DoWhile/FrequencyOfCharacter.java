package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter a character");
        String ch = input.next();
        input.close();

        int frequency = 0;

        for (int i = 0; i < str.length()-1; i++) { // i : index of str
            String ch1 = ""+str.charAt(i); // ch1 : each character of str // "" : to change thr char to String
            if (ch.equalsIgnoreCase(ch1)) {  // equalsIgnoreCase()  only for String for this reason we changed ch1 to String
              frequency +=1;
          }
        }
        System.out.println("frequency = " + frequency);


    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */