package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine(); // ozgur ciritbeyiEnter

        System.out.println("Enter your building number");
        String bldnumber = input.next(); // 2548AEnter // Enter will be left in Scanner memory

        input.nextLine(); // in order to empty the Scanner memory
        System.out.println("Enter your Street name");
        String streetName = input.nextLine(); // John Brown StreetEnter  // Scanner memory is empty

        System.out.println("Enter your city name");
        String cityName = input.nextLine(); // WaldmohrEnter   // Scanner memory is empty

        System.out.println("Enter your your state");
        String state = input.next(); // SaarlandEnter   // Scanner memory is empty

        System.out.println("Enter your zip code");
        String zipCode = input.next(); // 22012Enter

        input.nextLine();  // in order to empty the Scanner memory
        System.out.println("Enter your country name");
        String country = input.nextLine(); // USAEnter


        System.out.println("fullName = " + fullName);
        System.out.println("bldnumber = " + bldnumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        input.close();
    }
}
/*
1. Enter your full name ----- nextLine()
2. Enter your building number ---- next()
3. Enter your Street name  ----- nextLine()  ********
4. Enter your city name ---- nextLine()
5. Enter your state ----- next()
6. Enter your zip code ----next()
Display the shipping adress
 */