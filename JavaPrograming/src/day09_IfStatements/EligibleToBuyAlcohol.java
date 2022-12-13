package day09_IfStatements;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        String name = "Ediz";
        int age = 15;
        if (age>=18) {
            System.out.println(name + " is eligible to buy alcohol");
        } else {
            System.out.println(name + " is NOT eligible to buy alcohol");
        }
    }
}
