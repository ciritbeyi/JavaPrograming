package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2022;
        int number = 2;
        String result = "";
        if (number>=1 && number<=12) {
            switch (number){
                case 2:
                    result = (year%4 == 0)? "2 Days" : "28 Days";
                    // Ternaries ile yazdigimiz bu ifadeyi asagidaki gibi if stateent ile de yazabiliriz
                   // if (year%4 == 0){
                   //    result = "29 Days";
                   // } else {
                   //     result = "28 Days";
                  //  }
                    break;
                case 4: case 6: case 9: case 11: // we used or logic without using boolean
                    result = "30 Days";
                    break;
                default:      // case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    result = "31 Days";
            }
        } else {
            result = "Invalid";
        }
        System.out.println(result);

    }
}
