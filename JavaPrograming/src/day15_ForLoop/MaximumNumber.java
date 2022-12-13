package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -2147483648;  // This is the minimum integer number. Temporary value
        // any user entered number will be greater than this number
// we are assigning this value in order to guaranty that the numbers can be entered by user will be greater than this number
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();  // 1, 2, 3, 4, 5
            if (num > max) {
                max = num;  // if the entered num is greater than max, max will be assigned to that number
            }
        }

        System.out.println("max = " + max);
        input.close();






    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */