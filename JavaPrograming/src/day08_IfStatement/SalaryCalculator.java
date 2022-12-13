package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 65 ,
            weeklyHours = 40;
        double stateTaxRate = 2.5,
               federalTaxRate = 26.2;
//-----------------------------------------------
        int sallaryBeforeTax = hourlyRate * weeklyHours * 52;  // salary is equal to one week' salary * 52
        double stateTax= sallaryBeforeTax * stateTaxRate / 100;  // yuzde almak icin (/ 100) ekliyoruz
        double federalTax = sallaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double sallaryAfterTax = sallaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + sallaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $" + sallaryAfterTax);








    }
}
