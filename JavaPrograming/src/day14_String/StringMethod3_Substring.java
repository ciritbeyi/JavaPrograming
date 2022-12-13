package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
    // substring(beginningIndex , endingIndex):
        String word = "Cydeo School";
        //             012345
       String word1 =  word.substring(0, 4);
       String word2 = word.substring(0, 4+1);
        System.out.println("word1 = " + word1);  //  word1 = Cyde
        System.out.println("word2 = " + word2);  //  word2 = Cydeo

        String str1 = word.substring(6);  // as default: it takes till the end of String, starting with index number 6
        System.out.println("str1 = " + str1); //  word2 = Cydeo
    String word3 = "Java Programming Language";
        String s0 = word3.substring(0);
        String s1 = word3.substring(0, word3.indexOf(" ")); // "Java"  /// 3 kelimeli her cumle icin gecerli
        String s2 = word3.substring(word3.indexOf("P") , word3.indexOf(" L")) ; // "Programming"
        String s2_1 = word3.substring(word3.indexOf(" ")+1 , word3.lastIndexOf(" ")) ; // "Programming"   /// 3 kelimeli her cumle icin gecerli
        String s3 = word3.substring(word3.indexOf("L"));  // "Language"
        String s3_1 = word3.substring(word3.lastIndexOf(" ")+1);    /// 3 kelimeli her cumle icin gecerli

        System.out.println("s0 = " + s0); //  s0 = Java Programming Language
        System.out.println("s1 = " + s1);  //  s1 = Java
        System.out.println("s2 = " + s2);  //  s2 = Programming
        System.out.println("s2_1 = " + s2_1);  //   s2_1 = Programming
        System.out.println("s3 = " + s3);  //  s3 = Language
        System.out.println("s3_1 = " + s3_1);  // s3_1 = Language





    }
}
