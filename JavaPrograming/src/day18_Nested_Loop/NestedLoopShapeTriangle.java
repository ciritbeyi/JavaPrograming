package day18_Nested_Loop;

public class NestedLoopShapeTriangle {
    public static void main(String[] args) {

        String a = "*";
        for (int i = 0; i < 10 ; i++) {
            System.out.print(a);
            System.out.println();
            a += " *";
        }
    }
}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */