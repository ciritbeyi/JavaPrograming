package day18_Nested_Loop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String u = scan.next();
        System.out.println("Enter your user password:");
        String p = scan.next();

    if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
        System.out.println("logged In");
    } else {
        for (int i = 1 ; i < 4; i++) {
            System.out.println("Incorrect username or password");
            System.out.println("Enter your user name:");
            u = scan.next();
            System.out.println("Enter your user password:");
            p = scan.next();
            if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // to exit the loop when the user enters the correct data
                System.out.println("logged In");
                break;
            }
        }
        if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) { // if at the end of third attempt still u and p are incorrect
            System.out.println("Your account is locked.");
        }
    }
        scan.close();
    }
}
/*
2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

  Ask the user to enter their credentials.
  If credentials are matched, your program should print "Logged in."
 If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials
 and if all three attempts are failed, then print "Your account is locked."

 */