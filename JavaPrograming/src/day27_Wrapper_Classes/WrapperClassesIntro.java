package day27_Wrapper_Classes;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1;  // autoboxing
        int num2 = n1;  // unboxing
        System.out.println("--------------------------------");

        Integer integerValue = 100;

        long  longValue = integerValue;
        System.out.println("--------------------------------");

        int   num3 = 200;
        Integer   num4 = num3; // (Only same data type)  //Auto Boxing:
        // Long   x1 = num3;   or    Double d1 = num3; can not be.
        System.out.println("--------------------------------");

        // Non of Them:( Because both Primitive and Wrapper should be, here there is no Primitive)
        Integer   z = 900;
        Integer   y = z;
        System.out.println("--------------------------------");

        int[] numbers = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5}; // bunnu Array de yapabiliriz ama Collection veya Map de yapamayiz




    }
}
