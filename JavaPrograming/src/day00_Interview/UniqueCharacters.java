package day00_Interview;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  a String");
        String str = input.nextLine();

        String uniq = "";

        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    freq++;
                }
            }
            if (freq == 1){
                uniq += str.charAt(i);
            }
        }
        System.out.println("uniq = " + uniq);

    }

}
