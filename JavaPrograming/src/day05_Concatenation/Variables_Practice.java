package day05_Concatenation;

public class Variables_Practice {
    public static void main(String[] args) {
        byte num1 = 100;
        int num2 = 10000;
        double num3 = 2.5;
        float num4 = 2.5f;  // f is used to force the compiler to except the variable type as float.
        long num5 = 999999999;    // the number is in int range
        long num6 = 999999999999l;  // when the number is out of int range
        long num7 = 999_999_999_999L; // _ will not be print // just for making it readable
        int num8 = 85000;
        double num9 = 85000;  // Decimal numbers

        /*
        "123" = 1 = "1231"
        123 +1 = 124
        soutv : when we will print out a variable we will use soutv
         */
        System.out.println("num1 = " + num1);   // if we use soutv: varialbe Name will be print out.
        System.out.println(num1);               // if we use sout: varialbe Name will not be print out.
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        System.out.println("num9 = " + num9);

    }

}
/*
1. create a class called Varibales_Practice & declear the following variables:
                            num1 = 100;
                            num2 = 10000;
                            num3 = 3.5;
                            num4 = 2.5f;
                            num5 = 999999999999L;
                            num6 = 850000;

                print each of the variables above on the console

 */



