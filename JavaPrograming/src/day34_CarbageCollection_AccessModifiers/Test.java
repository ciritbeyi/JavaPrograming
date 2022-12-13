package day34_CarbageCollection_AccessModifiers;
import  static day34_CarbageCollection_AccessModifiers.Circle.*; // we import all the static members
import static utilities.MathUtility.sum;

public class Test {
    public static void main(String[] args) {
        System.out.println(pi); // after importing, we can type directly the name of static members
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("-----------------------------");

        // find the sum of 10 ,20
        System.out.println(sum(10, 20));
        // find the sum of 100 ,200
        int r2 = sum(100,200);

    }
}
