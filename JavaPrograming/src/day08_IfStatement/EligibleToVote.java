package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";  // true

//  Eligible
        if (isEligible = true){  //  true
            System.out.println(name + " is eligible to vote.");
        }

//  Not Eligible
        if (!isEligible){  //!true ==> not true ==> false
            System.out.println(name + " is not eligible to vote.");
        }

    }
}
