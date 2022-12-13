package day04_Variables;

public class PrimativesIntroTwo {
    public static void main(String[] args) {
       // in order to type # we will describe a character, or we will use it`s number at the ASCII Table.
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        System.out.println(ch1);

        char ch2 = 35;   // ASCII de 35 # demek.  All Unicode values from 0 to 65,535
        System.out.println("ch2 = " + ch2);

        char ch3 = 4500;
        System.out.println("ch3 = " + ch3); // 4500 un rakamasal karsiligi ne ise onu yazacak.

        char gender = 'M';
        System.out.println("gender = " + gender);
        char grade = 'A';
        System.out.println("grade = " + grade);
        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true;
        boolean isMaried = false;
        boolean result = 100 > 300 ;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMaried = " + isMaried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);
    }
}
