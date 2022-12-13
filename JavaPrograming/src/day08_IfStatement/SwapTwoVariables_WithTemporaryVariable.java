package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//------------------------------------
        int c = b;  // c=15  (c is a Temporary Variable here)
        b = a;      // b=10
        a = c;
//-------------------------------------
        System.out.println("a = " + a);
        System.out.println("b =  " + b);




    }
}
