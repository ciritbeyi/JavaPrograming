package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo"; // index : 01234

        char thirdChar = word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);
 //  char tentChar = word.charAt(9);  //compile error :  String index out of range: 9
// System.out.println("tentChar = " + tentChar);
        System.out.println("--------------------------------");
        String s1 = "Batch E10 is the best batch"; // anything in "" is a character.
        int totalChars = s1.length();  // total character
        System.out.println("totalChars = " + totalChars);  // totalChars = 27
        char lastChar = s1.charAt(totalChars-1);
        char lastChar1 = s1.charAt(s1.length()-1);  // last index number = total character - 1  // this is the best
        char lastChar2 = s1.charAt(26);  //  it is difficult to count and write the number
        System.out.println("lastChar = " + lastChar);    //  lastChar = h
        System.out.println("lastChar1 = " + lastChar1);  //  lastChar1 = h
        System.out.println("lastChar2 = " + lastChar2);  //  lastChar2 = h

        System.out.println("--------------------------------");
        String str = "wooden spoon";  // String is immutable, Once the object is created it can’t be Modified. (change)
         str.toUpperCase();  // "WOODEN SPOON"
        System.out.println("str = " + str);  // str = wooden spoon

        str = str.toUpperCase();  // in order to get the output we should assign back
        System.out.println("str = " + str);    // str = WOODEN SPOON

        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);  // TODAY IS A GREAT DAY TO LEARN JAVA PROGRAMMING LANGUAGE.




    }
}
