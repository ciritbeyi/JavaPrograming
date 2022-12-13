package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = new int [10];

        for (int i = 0; i < numbers.length; i++) { // loop to get the numbers from user and assign them to the array number
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();  // each user entered input will be assigned to the indexes of the array numbers
        } // closing loop

        int max = numbers[0]; // it is just an assumption
        int min = numbers[0]; // it is just an assumption

        for (int i = 0; i < numbers.length; i++) {   // loop to find the max and min  by comparing all elements with min and max
            if (numbers[i] > max) {  // if there is element in the array that's greater than the current max number
                max = numbers[i];  // assigning greater number to variable max
            }
            if (numbers[i] < min) {  // if there is element in the array that's smaller than the current min
                min = numbers[i];   //assigning smaller number to variable min
            }
        } // closing loop
        System.out.println("numbers = " + Arrays.toString(numbers)); // numbers = [12, 14, 15, 25, 36, 58, 99, 57, 88, 66]
        System.out.println("min = " + min);  // min = 12
        System.out.println("max = " + max);  // max = 99
scan.close();
    }
}
