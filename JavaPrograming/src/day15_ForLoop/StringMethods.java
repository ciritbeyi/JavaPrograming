package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

// . isEmpty() // .isBlank()
        String str1 = "";
        String str2 = "    ";
        String str3 = "Cydeo     ";
        boolean r1 = str1.isEmpty();   // r1 = true
        boolean r2 = str2.isEmpty();   // r2 = false
        boolean r3 = str2.isBlank();   // r3 = true
        boolean r4 = str1.isBlank();   // r4 = true
        boolean r5 = str3.isBlank();   // r5 = false
        System.out.println("r1 = " + r1);  // r1 = true
        System.out.println("r2 = " + r2);  // r2 = false
        System.out.println("r3 = " + r3);  // r3 = true
        System.out.println("r4 = " + r4);  // r4 = true
        System.out.println("r5 = " + r5);  // r5 = false
        System.out.println("----------------------");
        String s1 = "yes";
        String s2 = "yES";
        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equalsIgnoreCase(s2));  // true
        System.out.println("yES".equals("Yes"));   // false

        System.out.println("----------------------");
        String sentence = "My favorite programing language is Java";

        System.out.println(sentence.contains("C#"));   // false
        System.out.println(sentence.contains("lang"));  // true
        boolean c1 = sentence.contains("java");  //  c1 = false
        boolean c2 = sentence.toLowerCase().contains("java");  // c2 = true
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("----------------------");
        String sentence1 = "Wooden Spoon";
        System.out.println(sentence1.startsWith("Woo"));   // true
        System.out.println(sentence1.charAt(0) == 'W');    // true  // we can compare only one character
        System.out.println(sentence1.endsWith("Spoon"));   // true
        System.out.println(sentence1.endsWith("spoon"));  // false  // it is also Case Sensitive
        System.out.println(sentence1.toLowerCase().endsWith("spoon"));// true




    }
}
