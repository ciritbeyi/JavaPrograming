package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 100;
/*
        System.out.println("Odd Number");

        System.out.println("Even Number");
*/
        boolean evenNumber = number%2 ==0;
        boolean oddNumber =  ! evenNumber;  // we don't need this. if a number is not even it is odd.

        if(evenNumber) {
            System.out.println(number + " is even number");
        }
        if (oddNumber){
            System.out.println(number + " is odd number");
        }
        System.out.println("-------------------------------");
        int n = 200;
        // positive
        if (n>0){ // if n is greater than zero it's positive
            System.out.println(n + " is positive");
        }
        // negative
        if (n<0){  // if n is less than zero it's negative
            System.out.println(n + " is negative");
        }
        // zero
        if (n==0){  //// if n is equal to 0 than it's positive
            System.out.println(n + " is zero");
        }





        }



    }

