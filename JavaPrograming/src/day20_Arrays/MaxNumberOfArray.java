package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int max = numbers[0]; // we assume that first number is max than we will compare with the others

        for (int i = 0; i < numbers.length; i++) {  // Shortcut : numbers.fori + Enter / from first index of array to the last index
            if (numbers[i] > max) {  // if there is element in the array that's greater than the current max number
                max = numbers[i];  // assigning greater number to variable max
            }
        }  // closing loop
            System.out.println(max);  // 20



    }
}