package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "sdcDJavaJavaJavajavajAVAdcdc";

        String word = "Java";

        int frequency = 0;

        for (int i = 0; i <= str.length() - word.length(); i++) {
            String eachSub = str.substring(i,i+word.length());
            if (eachSub.equalsIgnoreCase(word)) {
                frequency += 1;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}

// for (int i = 0; i <= str.length() - word.length(); i++) {
//for (int i = 0; i < str.length() -3; i++) {
/*
2. write a program that can return the frequency of the a word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3

           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 1+4)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */