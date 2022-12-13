package day11_Switch_Scanner;
import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:"); // to tell the user what to do. // it must be before the Scanner Method
        int num1 = input.nextInt(); // java will wait us to type the input until hit the Enter
        System.out.println("Enter a decimal:");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1*num2));
        input.close();  // close the scanner // if you don't close at the background it is still running, and it uses extra memories
        // the performance of code and InteliJ will be slow down
        // after closing Scanner can not be used anymore


    }
}

