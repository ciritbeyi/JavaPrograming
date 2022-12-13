package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25; // + is optional
        int num2 = -25; // - is required

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0);  // true
        System.out.println("--------------------------------------");

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away immediately
        System.out.println(++a); // output : 6

        --a; // pre decrement: decreases the value by 1 right away immediately
        System.out.println(--a); // output : 5
        System.out.println("--------------------------------------");

        int b = 100;
        System.out.println(++ b); // output : 101 : pre increment: increases the value by 1 right away immediately
        int c = 100;
        System.out.println(c++);  // output : 100 : (first passes the current value)
        // post increment: (it will increase at the next line not in this line)
        System.out.println(c); // output : 101 // post increment: it will increase now
        System.out.println("--------------------------------------");

        int x = 200;
        System.out.println(--x); //  output:199 pre decrement: decreases the value by 1 right away immediately
        int y = 200;
        System.out.println(y--); // output: 200 (first passes the current value)
        // post decrement: (it will decrease at the next line not in this line)
        System.out.println(y);  //  output : 199 // post decrement: it will decrease now
        System.out.println("--------------------------------------");

        int z = 45;
        System.out.println(++z);  //output : 46
        System.out.println(z++);   //output : 46
        System.out.println(z);    //output : 47

        int q = 30;
        System.out.println(--q);  //output : 29
        System.out.println(q--);  //output : 29
        System.out.println(q);  //output : 28

    }
}
