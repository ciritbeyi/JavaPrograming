package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
    String str = "aaabccc";
    String result = ""; // temporary value

        for (int i = 0; i <str.length() ; i++) {  // i:represents all the index numbers of str (starting from 0)
            char ch = str.charAt(i);  // we divide str in to characters
            // str.indexOf(ch) == str.lastIndexOf(ch)  ==> it means that ch is unique
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        System.out.println("result = " + result);  // result = b




    }
}
/*
	3. Write a program that can return the unique characters from a String
			Ex:
				input:
					AABCCD
				output:
					BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */