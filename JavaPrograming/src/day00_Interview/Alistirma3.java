package day00_Interview;

import java.util.Scanner;

public class Alistirma3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int attempt = 3;
        int sum = 0;
  /*
        do {
            System.out.println( "Enter a number");
            int number = input.nextInt();

            if (number < 0){
                System.err.println("number must be positive");
                attempt--;
                System.out.println("your remaining attempts is: " + attempt);
            }
            sum = sum + number;
            System.out.println("sum is: " + sum);
        } while (attempt > 0);
*/
        System.out.println("================ Solution 2 ================");

        while (true) {

            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number >= 0) {
                sum = sum + number;
                System.out.println("sum is: " + sum);
            } else {

                while (attempt > 1) {

                    System.err.println("number must be positive");
                    attempt--;
                    System.out.println("your remaining attempts is: " + attempt);

                    System.out.println("Enter a number");
                    number = input.nextInt();
                }
                System.exit(0);

            }

        }
    }
}

/*
Practice:
Write a java program that calculates sum of the numbers entered by user.
If user enters a negative number, print out a message "number shouldn't be
negative" and give another chance to user.
Terminate the program after three unsuccessful attempts.

 */