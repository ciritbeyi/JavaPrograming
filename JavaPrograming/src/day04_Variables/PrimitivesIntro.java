package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
       // age:38 years old
        byte age = 38;
        // weight:160 pounds
        // byte weight = 160:  160 is out of byte`s range
        // byte num = 129; 160 is out of byte`s range
        short weight = 160; // 160 is in the range of short
        // salary:100000 $
        //short salary = 100000; // 100000 is out of short`s range
        int salary = 100_000;
        /* int is the preferred data type for integer numbers in Java.
        "_" is used just to read easy. only "_" can be used.
         */
       // int asset = 3_333_333_333;
        long asset = 3_333_333_333L;
        /* by "L" or "l" Compiler will understand that Data Type is "long"
        when we use "l" it gives warning. But warnings can be ignored. Only take care when it is error.
        without L Compiler will consider it as int.
         */
        // For all the integer we will use int.

        // tax: 0.26
        float tax = 0.26F; //by "F" or "f" Compiler will understand that Data Type is "float"
        double PI = 3.14; //without F Compiler will consider it as double.
        // For all the decimals we will use double.

        }
}
