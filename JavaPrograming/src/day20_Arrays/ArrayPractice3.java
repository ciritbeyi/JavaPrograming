package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();  // 5  // this will be the size of the array

        if (length<=0) { // yanlis deger girilmesini engellemek icin
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int [] numbers = new int[length];  // [0, 0, 0, 0, 0]
        // array needs to have enough capacity to contain all elements user going to enter

        for (int i = 0; i < length; i++) { // girilen degerleri array icine atmak icin / i: index number
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt(); // each input user provided during each execution of loop, will be assigned to the indexes of array
        }
        System.out.println(Arrays.toString(numbers));  // [10, 20, 30, 40, 50]

scan.close();

    }
}
