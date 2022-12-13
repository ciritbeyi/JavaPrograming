package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 2;  // 1 ~ 12

        boolean has28Days = number == 2;  // for the month that ha 28 day
        boolean has30Days = number == 4  || number == 6 || number == 9 || number == 11; // for the months that ha 30 day
        boolean has31Days = !has28Days || has30Days;  // for the months that ha 31 day
       // boolean has31Days = number == 1 || number == 3 || number ==5 || number == 5 || number == 8 || number == 10 || number ==12;
        // long but it can also be written like this
        if (has28Days) {  // if the month has 28 days
            System.out.println("28 Days");
        }
        if (has30Days) {   // if the month has 30 days
            System.out.println("30 Days");
        }
        if (has31Days) {   // if the month has 31 days
            System.out.println("31 Days");
        }
    }
}
/*
hints
Mounts that has 31 Days : 1, 3, 3, 7, 8, 10, 12
Mounts that has 30 Days : 4, 6, 9, 11
Mounts that has 28 Days : 2
 */