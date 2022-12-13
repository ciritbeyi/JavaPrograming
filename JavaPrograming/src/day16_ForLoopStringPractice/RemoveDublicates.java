package day16_ForLoopStringPractice;

public class RemoveDublicates {
    public static void main(String[] args) {
    String str = "aabbaacc";
    String result = "";  //  temporary value

  // in condition, we can also write like this: i<str.length() ==
        for (int i = 0; i <= str.length()-1 ; i++) { // i:represents all the index numbers of str (starting from 0)
            String ch = "" + str.charAt(i);  // represents each Character of str
            // by adding "" at the beginning we divert char to String
           // in contains () ==> in parenthesis we should write String
            if (!result.contains(ch)) {  // ! ==> means NOT contains (if the character is not contained in the result)
                result += ch;  // += the character will be added to the result
            }
        }
        System.out.println("result = " + result);  // result = abc




    }
}
/*



 */