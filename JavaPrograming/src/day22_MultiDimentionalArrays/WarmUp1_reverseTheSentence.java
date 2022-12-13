package day22_MultiDimentionalArrays;

import java.util.Arrays;

public class WarmUp1_reverseTheSentence {

    public static void main(String[] args) {
        String str = "Today is a good day to learn Java";

        String[] sentence = str.split(" ");

        System.out.println(Arrays.toString(sentence));

        String reversedStr = "";
        for (int i = sentence.length-1; i >=0 ; i--) {
            reversedStr += sentence[i] + " ";
        }

        System.out.println(reversedStr);

    }
}
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today

 */