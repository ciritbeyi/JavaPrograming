package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 14;
        String result = "";
        if (number>=1 && number<=18) {
            switch (number){
                case 6 : case 7 : case 8 :
                    result = "Middle school";
                    break;
                case 9 : case 10 : case 11 :  case 12 :
                    result = "High school";
                    break;
                case 13 : case 14 : case 15 : case 16 :
                    result = "College";
                    break;
                case 17 : case 18 :
                    result = "Grad School";
                    break;
                default:
                    result = "Elementary school";
            }
        } else {
            result = "Invalid grade level given";
        }
        System.out.println(result);
//=========
    }
}
/*
 1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
 */