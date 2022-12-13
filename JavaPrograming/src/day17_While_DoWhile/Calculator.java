package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();
        System.out.println("Enter your math operator");
        char ch = scan.next().charAt(0);  // the way to get a char from user.
// Task : + - are only available operator. if user enters another than these 2 it will write "Reenter your Operator"
/*      WITH if Statement
        if (!(ch == '+' || ch == '-')) {
            System.out.println("Re-enter your Operator");
             ch = scan.next().charAt(0);
        }
        System.out.println((ch == '+')? num1+num2  : num1 - num2);  // we used Ternaries
        // In this case ("Re-enter your Operator") will be displayed only ONE time
        -------------------------------------------------------
      WITH for loop is also works but it is NOT RECOMENDED
      // int i = 0; initialization is useless, but we must write otherwise it will give compile error.
     // Iterator is NOT a must=> if we don't use it will NOT give compile error.
        for (int i = 0; !(ch == '+' || ch == '-'); ) {
            System.out.println("Re-enter your Operator");
            ch = scan.next().charAt(0);
        }
        System.out.println((ch == '+')? num1+num2  : num1 - num2);  // we used Ternaries
        -------------------------------------------
  */ // WITH while loop
        // we don't know how many times user will enter Invalid Operator  ==> while loop is the BEST
        while (!(ch == '+' || ch == '-')) {  // if the operator is invalid it will continue to say ("Re-enter your Operator")
            System.out.println("Re-enter your Operator");
            ch = scan.next().charAt(0);
        }  // when the condition becomes false it will exit the loop
        System.out.println((ch == '+')? num1+num2  : num1 - num2);  // we used Ternaries
    }
}
