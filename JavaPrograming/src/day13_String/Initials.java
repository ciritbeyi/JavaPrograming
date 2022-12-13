package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = "" + f + l;  // if we write only  f+l  it will give compile error.
        // Because it is a concatenation. And it must contain at least one String. We used "" at the beginning
        String initial2 = f + "." + l;

        System.out.println("initial = " + initial);  // EC
        System.out.println("initial2 = " + initial2);   // E.C



    }
}
/*
Task:
	initial:
		firstName = "Wooden";
		lastName = "Spoon";
	output:
		W.S
 */