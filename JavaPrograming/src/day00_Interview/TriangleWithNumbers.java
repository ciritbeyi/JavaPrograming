package day00_Interview;

import java.util.Scanner;

public class TriangleWithNumbers {
    public static void main(String[] args) {
/*
    1
   222
  33333
 4444444
555555555
 */     Scanner input = new Scanner(System.in);
        System.out.println("Please enter the last number of tree"); //get bottom number of tree from users
        int lastNumber = input.nextInt();

        for(int i = 1 ; i<=lastNumber ; i++){      //this for creates line of tree
            int printNumber = (i*2) - 1 ;          //this variable determines numbers of "i" number to print
            for(int j = lastNumber-i ; j>0 ; j--){  //this for determines numbers of spare before printing i number
                System.out.print(" ");
            }
            for (int k = 1; k <= printNumber ; k++) { // this for print i numbers
                System.out.print(i);
            }
            for(int j = lastNumber-i ; j>0 ; j--){  //this for determines numbers of spare after printing i number
                System.out.print(" ");
            }
            printNumber = 1 ; // 1 is assigned to printNumber to determine how much time "i" will be printed for next iteration of i
            System.out.println();

        }
        System.out.println("------------Another solution-----------------");

        for (int i=1; i<=5; i++){

            for (int j = 5; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int z=1; z<=i;z++){
                System.out.print(i);
            }
            for (int k = 2; k <=i ; k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("=============================");
/*
          1
        222
      33333
    4444444
  555555555

*/

        for (int i =0; i < 5 ; i++) {
            System.out.println(" ".repeat(9-i*2+1)+ String.valueOf(i+1).repeat(i*2+1));

        }






    }
}

