package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
    String str = "Wooden Spoon";
    // index:     01234567891011

    String result1 = "";  // to contain the reversed version of str // noopS nedooW
    String result2 = "";
    String result3 = "";

        result1 += str.charAt(11); //n
        result1 += str.charAt(10); // o
        result1 += str.charAt(9); //o
        result1 += str.charAt(8); // p
        result1 += str.charAt(7); // S
        result1 += str.charAt(6); // ' '
        result1 += str.charAt(5); // n
        result1 += str.charAt(4); // e
        result1 += str.charAt(3); // d
        result1 += str.charAt(2); // o
        result1 += str.charAt(1); // o
        result1 += str.charAt(0); // =W

        System.out.println("result1 = " + result1);  //  result1 = noopS nedoon
        System.out.println("================");

        for (int i = 11; i >= 0 ; i--) {
            result2+= str.charAt(i);
        }
        System.out.println("result2 = " + result2);  // result2 = noopS nedooW

        System.out.println("================");
        for (int i = str.length()-1 ; i >= 0; i--) { // i is index numbers of str (starting last index to index 0)
            result3+= str.charAt(i);
        }
        System.out.println("result3 = " + result3);  //result3 = noopS nedooW
    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */