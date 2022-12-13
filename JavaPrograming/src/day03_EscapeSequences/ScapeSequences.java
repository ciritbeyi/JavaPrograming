package day03_EscapeSequences;
/*
Escape sequences: MUST be given with double qoute
    \n:Newline : starts a new line
    \t:Horizontal Tab : Causes the cursor to skip over to the next tab stop. \t\t gives 2 Tab (Paragraph)
    \\:Backslash : Causes a backslash to be printed
    \":Double quote : Causes a double quotation mark to be printed
 */
public class ScapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt is nice to see you all! \nWhat class do we have next week?");
        System.out.println("------------------------");
        System.out.println("    Java is Cool Programing Language");
        System.out.println("------------------------");
        System.out.println("\tJava is Cool Programing Language");
        System.out.println("\t\tJava is Cool Programing Language");
        System.out.println("------------------------");
        System.out.println("/ \\");// in order to print one backward slash we need to give two backward slashes
        System.out.println("------------------------");
        System.out.println("My favorite TV show is \"Game of Throne\" ");// in order to print double quote, we need to use \"

    }


}
