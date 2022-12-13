package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDEo",
                lastName = "SCHOOL";
       // firstName = firstName.substring(0).toUpperCase();  //  firstName = CYDEO
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();// Solutuion 1
        //firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); // Solutuion 2
        System.out.println("firstName = " + firstName);  //firstName = Cydeo
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);  // lastName = School
        String fullName =firstName + " " + lastName;
        System.out.println("fullName = " + fullName);  //fullName = Cydeo School
    }
}
