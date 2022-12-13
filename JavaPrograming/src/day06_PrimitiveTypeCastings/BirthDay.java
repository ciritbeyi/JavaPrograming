package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {
        String name = "Ozgur";
        int birthDay = 30;
        String month = "May";
        int birthYear = 1977;
        String bookName = "The Rich Dad and The Poor Dad";

        // name was born on month/day/year.

        System.out.println(name + " was born on " + month + "\\" + birthDay + "\\" + birthYear + ".");
        System.out.println(name + " was born on " + month + "/" + birthDay + "/" + birthYear + ".");

        // My favorite book is "bookName"
        System.out.println("My favorite book is " +"\"" +  bookName + "\"");
        System.out.println("My favorite book is " +"`" +  bookName + "`");
        //  Sequences : \n     \t     \"   \`   \\  \b
    }


}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */