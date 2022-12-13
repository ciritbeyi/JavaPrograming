package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 200.5,
                n2 = 10.5;

        char operator = '$';

        boolean valid = operator=='+' || operator=='-' || operator=='*'  ||operator=='/';
        double result = 0; // temporary value

        if (valid) {  // to declare the Pre Condition
            switch (operator){  // will give the result according to the operator
                case '+':
                    result = n1+n2;
                    break;
                case '-':
                    result = n1-n2;
                    break;
                case '*':
                    result = n1*n2;
                    break;
                default:
                    result = n1/n2;
            }
            System.out.println(result);
        } else { // if the operator is not valid
            System.err.println("invalid Operator:" + operator);
        }

    }
}
