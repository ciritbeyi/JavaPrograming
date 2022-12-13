package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
    boolean a = false;

        for (int i = 0; a; i++) {
            System.out.println("Wooden Spoon  -- for loop ");  //  will NOT print
        }

        System.out.println("---------------");
    while (a) {
        System.out.println("Wooden Spoon  -- while loop ");  //  will NOT print
    }
        System.out.println("---------------");
    do {
        System.out.println("Wooden Spoon di while loop"); // will print ONCE
    } while (a);




    }
}
