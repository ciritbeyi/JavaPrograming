package day31_Constructor;

public class BankAccount {

    public String accountHolder;
    public  long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $ " + balance +
                '}';
    }


    public void checkBalance(){ //  we don't need additional  information
        System.out.println("Your available balance is: " +  balance);
    }

    public void deposit(double amount){ // we need the amount as parameter
        if (amount < 0){
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }
            balance +=amount;
    }

    public void withdraw(double amount){ // we need the amount as parameter
        if (amount > balance){
            System.out.println("Your balance is not enough for withdrawing " + amount);
            return;  // exits the method
        }
        if (amount<=0){
            System.out.println("Withdrawing amount con not be negative or zero");
            return; // exits the method
        }
           balance-=amount;
    }





}
/*
BankAccount Task:
	        Attributes:
	                1. accountHolder, 2. accountNumber, 3. balance

	        Actions:
	        	1. setInfo(): sets the accountHolder and accountNumber attributes
	        	2. toString()
	            3. checkBalance():displays the available balance
	            2. deposit(): increases the balance by the given amount
				3. withdraw(): decreases the balance by the given amount
 */