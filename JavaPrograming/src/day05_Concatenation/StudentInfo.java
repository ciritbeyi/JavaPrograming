package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        String student_name = "Ozgur"; // String de Data " " icinde yazilir
        int age = 45;
        char gender = 'M';  // char da Data  '' icinde yazilir
        String school_name = "CYDEO";
        String phoneNumber = "(123)-456-7899";  // Data olarak rakam harince virseyler kullanacak ise String olmali
        boolean is_FullTime = true;  // anlasilir olmasi icin _ veya buyuk harf kullandik
        double GPA = 2.5;

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("is_FullTime = " + is_FullTime);
        System.out.println("GPA = " + GPA);

    }
}
/*
  2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
 */