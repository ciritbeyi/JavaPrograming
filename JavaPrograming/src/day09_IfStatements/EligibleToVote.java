package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Ediz", citizen = "T.C.";
        int age = 15;
        if ( age>18 && citizen == "T.C") {
            System.out.println(name + " is eligible to vote");
        } else {
            System.out.println(name + "  is NOT eligible to vote");
        }
    }
}
