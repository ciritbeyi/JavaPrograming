package day03_EscapeSequences; //it`sPackage name of the class

public class Println_Vs_Print2 {
    public static void main(String[] args) { //main method
        System.out.println("Knock Kock"); //first it prints Knock Knock, then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");
        System.out.println("------------------");
        System.out.print("Knock Knock"); //prints Knock Knock, does not appends a new line
        System.out.print("Who is this?");
        System.out.print("This is Java");
        System.out.println();
        System.out.println("------------------");
        System.out.println("Hello evryone? how are you all today? Today we will learn Escape Sequences and next week we will learn Variables");
        System.out.println("---------------");

        System.out.print("Hello Everyone, How are you all today");
        System.out.print("Today we will learn Escape Sequences");
        System.out.print("and next week we will learn Variables");

    }
}
