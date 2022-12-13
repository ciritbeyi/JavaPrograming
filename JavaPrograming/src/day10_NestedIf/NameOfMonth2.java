package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int number = 5;
        String month = "";
       month =  (number==1)? "January" :(number==2)?  "February" :(number==3)? "March" :(number==4)? "April" :(number==5)? "May"
        :(number==6)? "June" :(number==7)? "July" :(number==8)? "August" :(number==9)? "September" :(number==10)? "October"
        :(number==11)? "November" : "December";
        System.out.println(month);

        // the amount of ? and : must be equal=> otherwise we will have compile error
        // in if statement ( ) is a must, but in Ternaries ( ) is optional
        // But ( ) is recommended in Ternaries. It will be more readable
        System.out.println("--------------------------------");
        month =  number==1? "January" :number==2?  "February" :number==3? "March" :number==4? "April" :number==5? "May"
                :number==6? "June" :number==7? "July" :number==8? "August" :number==9? "September" :number==10? "October"
                :number==11? "November" : "December";
        System.out.println(month);
    }
}
