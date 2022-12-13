package day23_CustomMethods_Void;

public class CustomMethodsWithParemeters {
    public static void main(String[] args) {
    //    oddOrEven() ; // it means that the method demanding additional information
        oddOrEven(5);
        ageOfPerson(1977);
        printNumbers(4,9);
    }
    // create a function tht can check if a number is odd or even number
    public static void oddOrEven(int number){
        if (number%2 == 0){
            System.out.println( number + " is even number");
        } else  {
            System.out.println( number + " is odd number");
        }
    }

    // create a function tht can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is: " +age);
    }

    // create a function that can print all the numbers between X an Y
    public static void printNumbers(int x, int y){
        for (int i = x; i < y; i++) {
            System.out.println(i + " ");
        }
    }

}
