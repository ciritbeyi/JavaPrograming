package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        char[] chars = str.toCharArray();  // we can convert the String to array
        System.out.println(Arrays.toString(chars)); // [J, a, v, a]

        for ( char each : str.toCharArray()) { // to print out each char separately
            System.out.print(each + " - "); //J - a - v - a -
        }
    }
}
