package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@#$ %WoodenSpoon";
        String digits = "";  // temporary value
        String letters = "";  // temporary value
        String specialChar = "";   // temporary value

        for (int i = 0; i < str.length(); i++) {  // i: index numbers of str (0 ~ last index)
            char ch = str.charAt(i);  // ch : each character that we have in str
            if (ch >= '0' && ch <= '9') {   // ch is a char so we must use '0' and '9'
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // if the ch between 'A' to 'Z' then it is a letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') { // if the ch between 'a' to 'z' then it is a letter
                letters += ch;
            } else { //// if the ch is neither letter nor digit, then it is special character
                if (ch != ' ') {  // if the special character is not a space
                    specialChar += ch;
                }
            }
        }
        System.out.println("digits = " + digits);  // digits = 12345
        System.out.println("letters = " + letters);  // letters = CydeoSchoolWoodenSpoon
        System.out.println("specialChar = " + specialChar);   //  specialChar = !@#$%

        System.out.println("---------------------------------------------------");
        String digits1 = "";  // temporary value
        String letters1 = "";  // temporary value
        String specialChar1 = "";   // temporary value

        for (int i = 0; i < str.length(); i++) {  // i: index numbers of str (0 ~ last index)
            Character ch1 = str.charAt(i);  // ch : each character that we have in str
            if (Character.isDigit(str.charAt(i))) {
                digits1 += str.charAt(i);
            } else if (Character.isLetter(str.charAt(i))) {
                letters1 += str.charAt(i);
            } else {
                specialChar1 += str.charAt(i);
            }
        }

        System.out.println("digits1 = " + digits1);  // digits = 12345
        System.out.println("letters1 = " + letters1);  // letters = CydeoSchoolWoodenSpoon
        System.out.println("specialChar1 = " + specialChar1);   //  specialChar = !@#$%

    }
}
