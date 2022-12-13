package day15_ForLoop;

public class ForLoopAlphabet {
    public static void main(String[] args) {
        for (int i=65 ; i<=90 ; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
// we can also use char here because each char in ASCII table has an integer number
        for (char i = 'A' ; i<='Z' ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (char i='a' ; i<='z' ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (char i='Z' ; i>='A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        for (char i='z' ; i>='a' ; i--) {
            System.out.print(i+" ");
        }





    }
}
