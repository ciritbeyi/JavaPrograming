package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabccccdeeeef";
        // String i direk olarak ArrayList e ceviremiyoruz. Once array e cevirmek gerekiyor

        // convert String to String[]
        String[] ch = str.split("");
        System.out.println(Arrays.toString(ch));  // [a, a, a, b, c, c, c, c, d, e, e, e, e, f]

        // convert String to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        //ArrayList<String> list = new ArrayList<>(Arrays.asList(ch)); we can also type like this

        System.out.println("list = " + list); // list = [a, a, a, b, c, c, c, c, d, e, e, e, e, f]

        String unique ="";
        for (String each : list) {
            int freq = Collections.frequency(list,each);
            if ( freq == 1) {
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);  // unique = bdf

    }
}
