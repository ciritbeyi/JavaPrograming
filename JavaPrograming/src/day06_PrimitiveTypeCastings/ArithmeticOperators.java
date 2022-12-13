package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12"+1);    // 121 concatenation
        System.out.println(10+20);     // 30  ADDITION
        System.out.println(100-50);    // 50  SUBTRACTION
        System.out.println(10*5);      // 50 MULTIPLICATION

        System.out.println(100/3); // 33
        System.out.println((double)10/4);  // 2.5
        System.out.println(10.0/4);  // 2.5
        System.out.println(10/4.0);   //2.5
        System.out.println(10d/4);   // 2.5
        System.out.println(10/4D);   // 2.5

        int a = 100;
        double b = a/6;   // 16.0     integer / integer ===> integer ( but double is decimal)
        System.out.println(b);
        System.out.println( 100D);  //  100.0

        double c = a/6d;   //16.666....
        System.out.println(c);   // 1.6    integer / decimal ===> decimal
        double c1 = (double)a/6;
        System.out.println(c1);    //  decimal / integer ===> decimal

    }
}
/*
+ : ADDITION
- : SUBTRACTION
/ : DIVISION
    in math 10/4=2.5
    in jav = 10/4=2   //  10.0/4=2.5    //   10/4.0=2.5
        integer / integer ===> integer
        decimal / integer ===> decimal
        integer / decimal ===> decimal
        decimal / decimal ===> decimal
* : MULTIPLICATION
% : MODULUS


 */
