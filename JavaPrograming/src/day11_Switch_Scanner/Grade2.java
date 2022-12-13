package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'C';
        String result = "";
        switch (ch) {   // Switch-case statement da OR yapmanin tek yolu budur
            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
        default:
            result = "Invalid";
        }
        System.out.println(result);
    }
}
