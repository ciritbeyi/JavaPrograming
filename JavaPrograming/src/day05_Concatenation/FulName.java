package day05_Concatenation;

public class FulName {
    public static void main(String[] args) {
        String firstName = "Ozgur";
        String lastName = "Ciritbeyi";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName1 = firstName + lastName;    // Concatenation
        String fullName2 = firstName + " " + lastName;  // Concatenation

        System.out.println("fullName = " + fullName1); // without space
        System.out.println("fullName2 = " + fullName2);  // with space

        System.out.println(firstName + " " + lastName); // bastaki fullName ifadesini yazmaz
// Full name of the person is _______
        System.out.println("Full name of the person is " + fullName2);
// _____ is __ years old.
        System.out.println(fullName2 + " is " +age + " years old.");
// FullName is JobTitle, works at CompanyName, and FullName's salary is $Salary
        System.out.println(fullName2 + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName2 + "'s salary is $ " + salary);

    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full name
 */