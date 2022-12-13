package day25_Custom_Method_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println("result = " + result);

        int result2 = sum(15,16,17);
        System.out.println(result2);

        int result3 = sum(45,46,47,48);
        System.out.println("result3 = " + result3);


    }//main
    public static int sum (int a, int b){
        return a+b;
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
    }
    public static int sum (int a, int b, int c, int d){
        return sum(a,b,c) + d;
    }

}//class
