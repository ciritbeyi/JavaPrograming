package day21_ForEachLoop;


import java.util.Arrays;

public class Arraystility2 {
    public static void main(String[] args) {
        String[] students = {"Ozgur", "Ali", "Kenan", "Hatice", "Muzeyyen", "Ediz", "Zeynep", "Zehra", "Yusuf Ali"};

       String []  broders = Arrays.copyOf(students, 3); // it copies first 3 element
        System.out.println(Arrays.toString(broders)); // [Ozgur, Ali, Kenan]

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers, 5);  // creating a new array
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]
        System.out.println("------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 3,6);
        System.out.println(Arrays.toString(ch2)); //  [D, E, F]

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[]result = Arrays.copyOfRange(scores,3,7);
        System.out.println(Arrays.toString(result)); // [40, 50, 60, 70]
        int[]result1 = Arrays.copyOfRange(scores,6,scores.length);
        System.out.println(Arrays.toString(result1)); // [70, 80, 90, 100]





    }
}
