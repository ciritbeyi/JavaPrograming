package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
//  >     >=     <     <=     : only for numbers
        boolean result1 = 20 > 40;
        System.out.println("result1 = " + result1);   // result1 = false

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2);   //  result2 = true

        boolean result3 = 100 >= 100;
        System.out.println("result3 = " + result3);    //  result3 = true

        boolean result4 = 300 >= 500;
        System.out.println("result4 = " + result4);;   //    result4 = false

        //  credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;  //
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);  //  isEligibleForLoan = true

        boolean result5 = 100 < 120;
        System.out.println("result5 = " + result5);  //   result5 = true
        boolean result6 = 200 < 180;
        System.out.println("result6 = " + result6);  //    result6 = false

        int score = 59;
        boolean hasFailed = score <= 59;
        //                      75 <= 59                  //   hasFailed = false
        System.out.println("hasFailed = " + hasFailed);  //   hasFailed = true

        boolean result7 = 45 <= 60;
        System.out.println("result7 = " + result7);  //   result7 = true
        System.out.println("-----------------------------------");

//  ==   !=      they could be Numerical or String or char
        int x = 100;
        int y = 200;
        boolean equal = x == y;     // 100 == 200  it is NOT equal
        System.out.println("equal = " + equal);   //   equal = false

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);   //  result8 = false

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);   //   result9 = false
        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);  //  result10 = true
        boolean result11 = "Java" =="    Java   ";
        System.out.println("result11 = " + result11);   //  result11 = false

        System.out.println("-----------------------------------");
        boolean result12 = 100 != 200.5;
        System.out.println("result12 = " + result12);  //  result12 = true
        // boolean result13 = 100 != "200";    //   we CAN NOT compare number with String
        boolean result13 = "Java" != "Break";
        System.out.println("result13 = " + result13);  //   result13 = true
        boolean result14 = 300 != 300;
        System.out.println("result14 = " + result14);  //  result14 = false
    }
}
