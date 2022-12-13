package day17_While_DoWhile;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            String ch = ""+str.charAt(i);  // "A" , "A" , "B", "B" , "C" , "C", [contain() can NOT be used for char]
            if (result.contains(ch)) {   // if result already contains the character [(result.contains(""+ch)] can also like this
                continue;  // skip
            }
                result += ch;
            }


        System.out.println("result = " + result);  //result = ABC


    }
}
