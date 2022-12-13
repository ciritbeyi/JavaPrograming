package day18_Nested_Loop;

import java.util.Scanner;

public class AditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {  // outer loop
            System.out.println("Enter your first number");
            int num1 = scan.nextInt();
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Adition : " + (num1 + num2));

            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();

            // inner loop:: yukaridaki soruya "yes" veya "no" cevabi alincaya kadar asagidakini yazacak
            // eger bu kisim olmaz ise "no" harince ne yazarsan yaz outer loop a devam eder.
            while (!(a.equals("yes") || a.equals("no"))) {  // if the answer is invalid
                System.err.println("Invalid Entry, Please re enter");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")) {  // exit of outer loop
                break;
            }
        }
scan.close();
    }
}
