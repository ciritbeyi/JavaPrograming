package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
//3. Write a program that can calculate the sum of all integers between 1 to 100
    int sum = 0;
        for (int i = 1; i <101 ; i++) { // i:1,2,3,4,5,.....100
            sum +=i;
        }
        System.out.println(sum);
System.out.println("------------------------------------");

    int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
       for (int i = 1; i <=number ; i++) {
           total += i;
        }
        System.out.println("total = " + total);
        scan.close();
    }
    }

