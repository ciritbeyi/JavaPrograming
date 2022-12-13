package day12_Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     //   System.out.println("Enter true or false:");
    //     boolean result =  input.nextBoolean(); //  Only true or false can be

        System.out.println("Enter your name:");
        String name = input.next();  //  Java Programing ==> only Java will be printed

        System.out.println("name = " + name);
        input.close();




    }
}
