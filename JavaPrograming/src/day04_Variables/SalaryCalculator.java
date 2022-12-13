package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourly Rate, weeklyHours
        int hourlyRate =50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        System.out.println(salary); // If we type "salary" it it will be considered as a text.

// soutv + Enter is the shortcut for print out the variable.
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $ " + salary);




    }





}
