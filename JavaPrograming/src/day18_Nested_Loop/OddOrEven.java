package day18_Nested_Loop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    while (true) { // outer loop : in order to start an infinitive loop we use (true)
        System.out.println("Enter a number");
        int number = scan.nextInt();

        if (number % 2 == 0) {  //  in order to identify even numbers
            System.out.println(number + " is even Number");
        } else if (number % 2 != 0) {   //  in order to identify odd numbers
            System.out.println(number + " is odd Number");
        }
        System.out.println("Would you like to enter another number");
        String a = scan.next().toLowerCase();  //  in order to ignore case sensitivity
        // if a=="yes" outer loop will continue
        // if we don't use inner loop hear, there will be no difference between aa=="yes" or any other data except "no"
        while (!(a.equals("yes") || a.equals("no"))) {  // inner loop : to get "yes" or "no" answer
          System.err.println("Invalid answer. Please re enter");
          a = scan.next().toLowerCase();
        }  // inner loop closing : this loop will automatically exit when a Valid entry made

        if (a.equals("no")) {
                break; // exit the outer loop : in order to exit from an infinitive loop we use break
            }
        } // outer loop closing

    }
    }

/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps

 */