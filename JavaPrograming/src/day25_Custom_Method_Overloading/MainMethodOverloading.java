package day25_Custom_Method_Overloading;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("String");
    }
    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }
    public static void main(char[] args) {
        System.out.println("char");
    }
//   output => String   : because main method is the building method in java and java accepts this one as actual????
    // there is no benefit in overloading the main method
}
