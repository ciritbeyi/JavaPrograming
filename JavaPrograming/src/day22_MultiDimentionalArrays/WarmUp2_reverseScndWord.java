package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class WarmUp2_reverseScndWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";

        String[] words = sentence.split(" ");

        String secondWordReverse ="";

        for (int i = words[1].length()-1; i >=0 ; i--) {  // to reverse the second element
            secondWordReverse += words[1].charAt(i);
        }
        // to replace the second word with reversed one
        sentence = sentence.replaceFirst(words[1],secondWordReverse);
        System.out.println(sentence);  // I evoL Java

        words[1] = secondWordReverse;
        System.out.println(Arrays.toString(words));   // [I, evoL, Java]

        for (String each : words) {
            System.out.print(each + " ");  // I evoL Java
        }
    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */