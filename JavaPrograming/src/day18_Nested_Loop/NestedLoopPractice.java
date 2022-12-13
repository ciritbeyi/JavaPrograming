package day18_Nested_Loop;

import java.util.Scanner;

public class NestedLoopPractice {   // Nested While loop  :
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {  // outer loop opening :
            System.out.println("Enter your age");
            int age = scan.nextInt();

            while ( ! (age>0 && age<=120) ) { //inner loop 1 : is getting the Valid age
                System.err.println("Invalid entry. Please re enter");
                age = scan.nextInt();
            }  // inner loop 1 closing :
            System.out.println("Would you continue");
            String a = scan.next().toLowerCase();

            while ( !( (a.equals("yes")) ||  a.equals("no") ) ) {  //inner loop 2 : is getting "yes" or "no"
                System.err.println("Invalid entry. Please re enter");
                a = scan.next().toLowerCase();
            }  //inner loop 2 closing : this loop will exit when it gets "yes" or "no"

            if (a.equals("no")) {  // in order to exit the outer loop
                break;  // exit the outer loop
            }
        }  // outer loop closing :
    scan.close();
    }
}
