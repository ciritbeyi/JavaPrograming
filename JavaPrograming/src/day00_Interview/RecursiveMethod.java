package day00_Interview;

public class RecursiveMethod {

    public static void main(String[] args) {

        method(25);  // will start from 25
    }

    // this is a recursive method, in the recursive method, you need use a return statement
    // to not to get an error
    public static void method(int a) {
        if(a == 100) { // will stop at 99
           return;
        }
        System.out.println(a++);
        method(a);
    }




}
