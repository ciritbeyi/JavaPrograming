package day12_Scanner;

// import java.util.*;  // wild import
// ( it imports everything in the util package)// it takes more memory
import java.util.Scanner; // regular import : imports one class
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");
// to tell the user what to do. // it must be before the Scanner Method
        int num = input.nextInt();
//java will wait us to type the input until hit the Enter
// we assign input as a variable before

        String result = ""; // temporary value

        if (num>=1 && num<=7) { // num : 1~7
            result = (num==1)? "Monday"   :(num==2)? "Tuesday"     :(num==3)? "Wednesday"
                    :(num==4)? "Thursday"   :(num==5)? "Friday" :(num==5)? "Saturday"  : "Sunday";
        } else {
            result = "Invalid Number";
        }
        System.out.println(result);
        input.close();  //  close the scanner
        // if you don't close, at the background it is still running, and it uses extra memories.
        // the performance of code and InteliJ will be slow down.
        // after closing Scanner can not be used anymore.
    }
}
