package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; //byte num1 = averageScore; it gives error. // we must add (byte) explicit casting
        short num2 = (short) averageScore; //short num2 = averageScore; ; it gives error. // we must add (short) explicit casting
        int num3 = (int) averageScore; //int num3 = averageScore; ; it gives error. // we must add (int) explicit casting
        int num31 = (short)averageScore;
        // 20.5 is in the short range but when we change the data more than short ranga it will again give error. It is better casing it to (int)
        long num4 = (long) averageScore; //long num4 = averageScore; ; it gives error. // we must add (long) explicit casting
        float num5 = averageScore; // no casting hear
        double num6 = averageScore; // implicit casting : double num6 = (float)averageScore; we can do manually but no need

        System.out.println("num1 = " + num1);
        System.out.println("num2 = "       + num2);  // we will NOT see these spaces in the output
        System.out.println("num3 =      " + num3); // we will see these spaces in the output
        System.out.println("num31 = " + num31);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5); // output will be decimal
        System.out.println("num6 = " + num6); // output will be decimal
    }
}

/*
Package name: day07_Operators

Warmup tasks:
	1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
implicit casting : casting smaller type to larger
explicit casting : casting larger type to  smaller
 */