package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();

        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

input.close();

    }
}
/*
Tasks:
	1. Write a program that can reverse any given string
			String str = "Java"; ==> avaJ
		 //			      0123

 */