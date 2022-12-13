package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();

        System.out.println("Enter the math opertor");
        char operator = scan.next().charAt(0);

        if ( !(operator =='+' || operator=='-')) { // if the operator is not valid
            System.err.println("Invalid math operator");
            System.exit(0);  //  rest of the program will not execute
        }

        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        if (operator == '-') {
            System.out.println(num1-num2);
        } else {
            System.out.println(num1+num2);
        }




    }
}
