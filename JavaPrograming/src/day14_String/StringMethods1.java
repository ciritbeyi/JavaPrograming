package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
     String str1 = "      batch     25     ";
        str1.trim();  // "batch     25"
        System.out.println("str1 = " + str1);  // str1 =       batch     25
        str1 = str1.trim();
        System.out.println("str1 = " + str1);  // str1 = batch     25

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1); //  n1 = 8
        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);  //  n2 = 4  it counts the first o from the left
        int n2a = str2.indexOf("ool");
        System.out.println("n2a = " + n2a); //  n2a = 9

        String str3 = "Java Programming language";
        int n3 = str3.indexOf("am");
        System.out.println("n3 = " + n3);  //n3 = 10  it counts from the left. it looks the first matching one

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);  //  n5 = 23  //  it looks the first matching one from the right.

       System.out.println("==============================");
       String s = "Java Nova Cava Wawa orange";
       int firstA = s.indexOf("a");
       System.out.println("firstA = " + firstA);   // firstA = 1
       int secondA = s.indexOf("a ");
       System.out.println("secondA = " + secondA);  // secondA = 3
       int thirdA = s.indexOf("a C");
       System.out.println("thirdA = " + thirdA); //  thirdA = 8
       int forthA = s.indexOf("ava W");
       //int forthA = s.indexOf("a")+1;  // gives the same result with previous one  // forthA = 11
       System.out.println("forthA = " + forthA);  // forthA = 11
       int forthA1 = s.lastIndexOf("av");
       System.out.println("forthA1 = " + forthA1);  //  forthA1 = 11
       int fiftA = s.lastIndexOf("va")+1;
       //int fiftA = s.lastIndexOf("a W");// gives the same result with previous one  //fiftA = 13
       System.out.println("fiftA = " + fiftA);  //fiftA = 13
       int sixthA = s.lastIndexOf("aw");
       System.out.println("sixthA = " + sixthA);
       //int seventhA = s.indexOf("a o");
       int seventhA = s.lastIndexOf("a ");  // this is easier than first one for compiler
       System.out.println("seventhA = " + seventhA); // seventhA = 18
       int lastA = s.lastIndexOf("a");
       System.out.println("lastA = " + lastA);  //  lastA = 22
        System.out.println("==============================");




    }
}
