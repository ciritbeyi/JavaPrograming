package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 3; // 1 ~ 7
        if (n == 1){
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Tursday");
        }else if (n == 5) {
            System.out.println("Friday");
        }else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
        System.out.println("-------------------------");

        String day = "";  // If we use a variable, we are using only one print segment at the end.

        if (n == 1){
            day = "Monday";
        } else if (n == 2) {
           day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Tursday";
        }else if (n == 5) {
            day = "Friday";
        }else if (n == 6) {
            day = "Saturday";
        } else {
            day = "Sunday";
        }
        System.out.println(day);


    }
}
