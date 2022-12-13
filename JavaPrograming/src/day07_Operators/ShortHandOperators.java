package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // assignment: = we use this assignment to update the data (reassignment)
        int number = 100;
        System.out.println("number = " + number); // 100
        number = 200; // we dont declare another variable we just update it. variable name must be unique
        System.out.println("number = " + number); //200
        //number = "2000";    // data must be according to the variable type given at the beginning. MUST be int.
        String word = "Java Programing";
        System.out.println("word = " + word); // output: "Java Programing"
        word = "Wooden Spoon";
        System.out.println("word = " + word); // output: "Wooden Spoon"
        word = "Cydeo";    // one variable can contain only one data
        System.out.println("word = " + word);  // output: "Cydeo"
        //word = 123; // at the beginning we variable Type was given String, so we can NOT assign integer here
        word = "Java Programing";
        System.out.println("word = " + word); // output: "Java Programing"
        System.out.println("-------------------------------------");
// Addition Assignment :
        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x+200); // 300
        //x = x+200;
        x+= 200;
        System.out.println("x = " + x); // 300

        String str = "Wooden";
        str += " Spoon";  // it does concatenation also ONLY THE Addition Assignment can be used for String
        System.out.println("str = " + str);  // str = Wooden Spoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // 2.5
        num1+= 5.5;
        System.out.println("num1 = " + num1); // 8.0

        double availableBalance = 1000.50;
        // deposit 300$
        availableBalance += 300;  // availableBalance = 1000.5 + 300
        System.out.println("availableBalance = " + availableBalance); // availableBalance = 1300.5
        System.out.println("-------------------------------------");
// Subtraction Assignment :
        // withdrawing 500$
        availableBalance-= 500;  // availableBalance = 1300.5 - 500
        System.out.println("availableBalance = " + availableBalance); //  availableBalance = 800.5

        // withdrawing 200$, then deposit 400$
        availableBalance-= 200;
        availableBalance+= 400;
        System.out.println("availableBalance = " + availableBalance); // 1000.5
        System.out.println("-------------------------------------");
//Multiplication Assignment :
        double salary = 50000.50;
        System.out.println("salary = " + salary); // salary = 50000.5
        salary*= 2; // salary = salary *2  can be written like this also, but it is long
        System.out.println("salary = " + salary); // salary = 100001.0

        double doge = 000000001;  // 0.000_000_01; can be written like this also
        doge*=1000000;
        System.out.println("dodge = " + doge);
        System.out.println("-------------------------------------");
//Division Assignment :
        double num2 = 25000;
        num2/=2; // num2 = num2 / 2  can be written like this also, but it is long
        System.out.println("num2 = " + num2);
        System.out.println("-------------------------------------");
//Remainder Assignment :
        double num3 = 100;
        num3%=3;
        System.out.println("num3 = " + num3);  // num3 = 1.0
        System.out.println("-------------------------------------");
        int amount = 127;  // cents
        int quarters = amount / 25;
        int cents = amount% 25;
        System.out.println("quarters = " + quarters);  //  quarters = 5
        System.out.println("cents = " + cents);  //  cents = 2
        System.out.println("-------------------------------------");
        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);  // cents2 = 2
        System.out.println("-------------------------------------");
        int y = 300;
        y %=16;
        System.out.println("y = " + y);  // y = 12
        System.out.println("-------------------------------------");
        int balance = 3500;
        // insurance fee:$153
        balance%= 153;
        System.out.println("balance = " + balance);  // balance = 134

    }
}
