package day24_CustomMethods_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {

        nameOfMoth(50);

    }

    public static void nameOfMoth(int number) {

        if ( number < 1 || number>12) {
            System.err.println("Invalid");
            return; // exits nameOfMoth method, remaining code fragment of the method never gets executed
        }

        String name = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" :(number==4)? "Apr" :(number==5)? "May"
                :(number==6)? "Jun" :(number==7)? "Jul" :(number==8)? "Agu" :(number==9)? "Sep" :(number==10)? "Oct"
                :(number==11)? "Nov" : "Dec";
        System.out.println("month name = " + name);

    }






}
