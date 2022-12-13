package day14_String;

public class StringMedhod4 {
    public static void main(String[] args) {
        String str = "Cydeo";

       String str2 = str.repeat(4);
        System.out.println("str2 = " + str2); //  str2 = CydeoCydeoCydeoCydeo
        System.out.println("-------------------");
        System.out.println("Ediz ".repeat(5));   // Ediz Ediz Ediz Ediz Ediz
        System.out.println("Ediz\n".repeat(3));   //
        System.out.println("-------------------");
        String name = "Java";
        System.out.println((name + " ").repeat(5));  //  Java Java Java Java Java



    }
}
