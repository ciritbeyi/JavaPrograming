package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;

        boolean leapYear = year %4 == 0;

        if (leapYear) {
            System.out.println("Year " + year + " is leap year");
        }
        if (!leapYear) {
            System.out.println("Year " + year + " is not leap year");
        }
        System.out.println("---------------------------------");

        if (leapYear) {
            System.out.println("Year " + year + " is leap year");
        } else {
            System.out.println("Year " + year + " is not leap year");
        }
// every time we use independent is statement java compiler checks each of them. (although first statement is true
// In if else Statement compiler first checks the if statement, when if statement is true compiler does not check the else statement



    }
}
