package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100, n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equel = n1 == n2;

        if (n1IsMin){  // if n1 is the minimum number
            System.out.println(n1 + " is minimum number");
        }
        if (n2IsMin){   // if n2 is the minimum number
            System.out.println(n2 + " is minimum number");
        }
        if (equel){  // if n1 == n2
            System.out.println(n1 + " is equal to " + n2);
        }
/*
        if (n1 < n2) {
            System.out.println(n1 + " is the minimum number");
        }
        if (n2 < n1) {
            System.out.println(n2 + " is the minimum number");
        }
        if (n1==n2) {
            System.out.println(n1 + " is equal to " + n2);
        }
*/
    }
}

