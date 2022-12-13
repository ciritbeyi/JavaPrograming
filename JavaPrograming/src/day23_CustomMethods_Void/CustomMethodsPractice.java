package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNumbersFrom1To10 ();
    }

    // create a function that can print hello world 5 times  ==> helloWorld5Times
    public static void helloWorld5Times () {
        for (int i = 0; i < 5; i++) {
            System.out.print("hello world  ");
        }
    }

    // create a function that can print hello Cydeo 5 times  ==> helloCydeo5Times
    public static void helloCydeo5Times () {
        for (int i = 0; i < 5; i++) {
            System.out.print("hello Cydeo  ");
        }
    }

    // create a function that can print all even numbers from 1 ~ 10
    public static void evenNumbersFrom1To10 () {
        String result = "";
        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                result+= i + " ";
            }
        }
        System.out.println(result);
    }




}
