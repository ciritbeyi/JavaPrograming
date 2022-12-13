package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cldeo1990@";
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialCharacters = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecialCharacters++;
            }

        }

        System.out.println("countSpecialCharacters = " + countSpecialCharacters);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigit = countDigits > 0;
        boolean hasSpecialCharacters = countSpecialCharacters >0;

        boolean strongPassword = password.length() >= 8 && !password.contains(" ")  && hasDigit && hasSpecialCharacters && hasUpperCase  && hasLowerCase;

        System.out.println("strongPassword = " + strongPassword);
/*
boyle de yazilabilir
        if (password.length() >= 8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowerCase){
                        if (hasDigit){
                            if (hasSpecialCharacters){
                                strongPassword = true;
                            }
                        }
                    }
                }
            }
        }

 */





    }
}
