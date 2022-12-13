package day11_Switch_Scanner;

public class NumberTWords {
    public static void main(String[] args) {
        int number = 7;
        String word = "";
        boolean validnumber = number>=0 && number<=9;

        if (validnumber) {
           if (number==0) {
               word = "Zero";
           } else if (number==1) {
               word = "One";
           } else if (number==2) {
               word = "Two";
           } else if (number==3) {
               word = "Three";
           } else if (number==4) {
               word = "Four";
           } else if (number==5) {
               word = "Five";
           } else if (number==6) {
               word = "Six";
           }else if (number==7) {
               word = "Seven";
           }else if (number==8) {
               word = "Eight";
           }else  {
               word = "Nine";
           }
        } else {
            word="Invalid Number";
        }
        System.out.println(word);
        System.out.println("---------------------------");
        String result = (number>=0 && number<=9)?
               (number==0)? "Zero" :(number==1)? "One" :(number==2)? "Two":(number==3)? "Three":(number==4)? "Four"
                       :(number==5)? "Five" :(number==6)? "Six" :(number==7)? "Seven" :(number==8)? "Eight": "Nine"
                :"Invalid Number";

        System.out.println(result);

    }

}
