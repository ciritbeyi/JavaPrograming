package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {
        int score = 55;
        boolean passed = score >= 60;
        if (passed) {
            System.out.println("congrats, you passed");
        } else {
            System.out.println("Sorry, you failed");
        }


    }
}
