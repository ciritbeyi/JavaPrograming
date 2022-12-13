package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your fullName:");
        String fullName = input.nextLine();  // ozgur CiritbeyiEnter (nothing left in the memory)

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine(); // Java Programming LanguageEnter (nothing left in the memory)
        // Only in nextLine method there is notting left in the Scanners memory

        System.out.println("Enter your age:");
        int age = input.nextInt();  //45Enter => Enter will be left in the Scanners memory

        input.nextLine();  // it is used to empty the Scanners memory  // (Enter which is left from age)
        System.out.println("Enter your school name: ");
        String schoollName = input.nextLine();  // Enter

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoollName = " + schoollName);
        input.close();  // Do NOT forget this
    }
}
