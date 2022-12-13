package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int[] number = {100, 500, 30, 40, 600, 80, -90};

        int min = number[0];

        for (int i = 0; i < number.length; i++) { // loop to compare all elements with min
            if (number[i] < min){ // if there is element in the array that's smaller than the current min
                min = number[i];  //assigning smaller number to variable min
            }
        } // closing loop
        System.out.println(min);








    }
}
