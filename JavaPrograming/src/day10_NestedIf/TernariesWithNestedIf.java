package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 85;
        String word = "";
        if (s>=0 && s<=100) {
            if (s>=90) {
              word = "Excellent";
            } else if (s>80) {
                word = "Great";
            } else if (s>=70) {
                word = "Good";
            } else if (s>=60) {
                word = "Passed";
            } else {
                word = "Failed";
            }
        } else {
            word = "Invalid Score";
        }
        System.out.println(word);
        System.out.println("--------------------------------");
        // solution 2: use ternaries ONLY
// Nested if statement can also divert to Ternaries, but it is not recommended because of Not being readable
        word = (s>=0 && s<=100)? (s>=90)? "Excellent" :(s>80)? "Great" :(s>=70)? "Good" :(s>=60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(word);
        System.out.println("--------------------------------");
        // Solution 3: Mix of them ==> This is recommended
        if (s>=0 && s<=100) { // if the s is valid (0 ~100)

            word = (s>=90)? "Excellent" :(s>80)? "Great" :(s>=70)? "Good" :(s>=60)? "Passed" : "Failed";

        }  else { // if the s is NOT valid
            word = "Invalid Score";
        }
        System.out.println(word);
// Ternaries have limitations. If statements are more powerfully
    }
}
