package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber = 50;
// 100 + 50 = 150   ( Option 1)
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));

// 100 - 50 = 50    ( Option 2)
        int subtraction = firstNumber-secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);

// 100 * 50 = 5000   ( Option 2)
        int multible = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + multible);

    }
}
