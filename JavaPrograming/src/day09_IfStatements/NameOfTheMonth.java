package day09_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int number = 1;
        String month;
        if (number ==1){
            month = "January";
        } else if (number == 2){
            month = "February";
        } else if (number == 3){
            month = "March";
        } else if (number == 4){
            month = "April";
        } else if (number == 5){
            month = "May";
        }else if (number == 6){
            month = "June";
        } else if (number == 7){
            month = "Jully";
        }else if (number == 8){
            month = "Agust";
        } else if (number == 10){
            month = "October";
        }else if (number == 11){
            month = "November";
        } else {
            month = "December";
        }
        System.out.println(month);
    }
}
