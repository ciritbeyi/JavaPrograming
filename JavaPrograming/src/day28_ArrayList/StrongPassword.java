package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {
        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");  // requirement1
        boolean r2 = false; // has upper case
        boolean r3 = false;  // has lower case
        boolean r4 = false;  // has special characters
        boolean r5 = false;  //  contain a digit

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))   )  r2 = true;
            if (Character.isLowerCase(password.charAt(i))) r3 = true;
            if (!Character.isLetterOrDigit(password.charAt(i))) r4 = true;
            if (Character.isDigit(password.charAt(i))  ) r5 = true;
        }
        if (r1 && r2 && r3 && r4  && r5) {
            System.out.println(password + " is Strong");  // Cydeo1990@ is Strong
        }
        System.out.println("--------------------------------");
        char[] chars = password.toCharArray();
        for (char each : chars) {

            if (Character.isUpperCase(each) ) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else  { // special characters
               r4 = true;
            }
            if (r2 && r3 && r4 && r5) { // diyelimki ilk 4 karakterde sartlari sagladi. o zaman gerisini kontrol etmesine geek yok
                break;
            }

        } // loop
        boolean isStrongPassword = r1 && r2 && r3 && r4  && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);  // isStrongPassword = true

    }// main
} // class
/*
  Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */
