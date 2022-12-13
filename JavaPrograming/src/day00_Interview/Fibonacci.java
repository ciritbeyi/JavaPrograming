package day00_Interview;

public class Fibonacci {

    public static void main(String[] args) {

        fib(5);


    }//main

    public static void fib(int length){

        int first = 0;
        int second = 1;
        int next = 1;

        System.out.print( first + " , " + second + " , ");
        for (int i = 0; i < length ; i++) {
            next = first+second;
            first = second;
            second = next;

            System.out.print(next + " , ");
        }

    }




}
