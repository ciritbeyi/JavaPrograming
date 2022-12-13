package day31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ozgur Ciritbeyi",123456789);

        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance(); // Your available balance is: 1000.0
        account1.withdraw(100);
        account1.checkBalance(); // Your available balance is: 900.0
        System.out.println("------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ediz", 147258369);
        account2.deposit(10000);
        account2.checkBalance(); // Your available balance is: 10000.0
        account2.withdraw(25000); //Your balance is not enough for withdrawing 25000.0



    }


}
