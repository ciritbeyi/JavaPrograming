package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 404;

        if (score>=0 && score<=100) { // if the score is valid
            if (score >= 60) { // is student passed the exam
                System.out.println("Passed");
            } else {  // is student failed the exam
                System.out.println("Failed");
            }

        } else {  // if the score is  NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------------");

        int age = 25;
        boolean hasId = true;
        if (hasId){ // if the person has Id
            if (age>=21) { // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            } else { // if the person is  less than 21 years old
                System.out.println("NOT eligible to buy alcohol");
            }
        } else {  //if the person does NOT have Id
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("-------------------------------");

        int number = 5;
// 1 <= number <= 7  it is OK in math but in Java we must divide as below
        if(number >=1 && number <=7) { //  if the number is valid
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else { // if the number is NOT valid
            System.out.println("Invalid Number");
        }



    }
}
