package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius");

        double r = input.nextDouble();
//        input.close();  // Scanner i en son kullandigimiz yerde kapatabiliriz.
        double area = r* r * 3.14,
                perimeter = 2 * r * 3.14;

        System.out.println("area =  " + area);
        System.out.println("perimeter = " + perimeter);
        input.close(); //Scanner i tekrar kullanma ihtimalimiz varsa en sonda da kapatabiliriz.












    }
}
