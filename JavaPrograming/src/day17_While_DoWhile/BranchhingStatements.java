package day17_While_DoWhile;

import java.util.Scanner;

public class BranchhingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z';  i++) {
            if (i == 'F') {
                break;  // Exit the loop
            }
            System.out.print(i+" ");  //  A B C D E
        }
        System.out.println();
        System.out.println("--------------------");
        Scanner scan = new Scanner(System.in);   //  Scanner i loop icinde yazmamaliyiz. bir tane Scanner yeterli.
        while (true){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num<0) {
                break;  // when a negative number entered it will exit the loop
            }
        }



    }
}
