package utilities;

public class MathUtility {

    // sum of Two Integers
    public static int sum ( int a, int b){
       return  a+b;
    }
    // sum of Two decimals
    public static double sum ( double a, double b){
        return  a+b;
    }
    // subtract of Two Integers
    public static int subtract ( int a, int b){
        return  a+b;
    }
    // subtract of Two decimals
    public static double subtract ( double a, double b){
        return  a-b;
    }
    // multiplication of Two Integers
    public static int multiply ( int a, int b) {
        return a * b;
    }
    // multiplication of Two decimals
    public static double multiply ( double a, double b) {
        return a * b;
    }
    // division of Two Integers
    public static int division ( int a, int b) {
        return a / b;
    }
    // division of Two decimals
    public static double division ( double a, double b) {
        return a / b;
    }
    // checks if the integer number is even
    public static void isEven ( int a) {
        if (a % 2 == 0)     System.out.println(a + "is a Even Number");
    }
    // checks if the integer number is odd
    public static void isOdd ( int a) {
        if (a % 2 != 0)     System.out.println(a + "is a Even Number");
    }

    // returns the maximum number between two integers
    public static int max ( int a, int b) {
        int max = a;
        if (b > a)   max = b;
        return max;
    }
    // returns the maximum number between two decimals
    public static double max ( double a, double b) {
        double max = a;
        if (b > a)   max = b;
        return max;
    }


    // returns the minimum number between two integers
    public static int min ( int a, int b) {
        int min = a;
        if (b < a)   min = b;
        return min;
    }
    // returns the minimum number between two decimals
    public static double min ( double a, double b) {
        double min = a;
        if (b < a)   min = b;
        return min;
    }

    // return the square of an integer
    public static int square ( int a) {
        return a*a;
    }

    // return the square of a decimals
    public static double square ( double a) {
        return a*a;
    }
    // return the cube of an integer
    public static int cube ( int a) {
        return a*a*a;
    }
    // return the cube of a decimals
    public static double cube ( double a) {
        return a*a*a;
    }








} // class end
