package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
// 1) write a program that can swap the first and last elements of an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers); // [8, 2, 3, 4, 5, 6, 7, 1]
        System.out.println("------------------------------");
// 2) write  a program that can move alla zeros to the last indexes off ArrayList (Don't create an additional ArrayList)
// Ex: list:{1,0,2,0,3,0,4,0}  output: [1,2,3,4,0,0,0,0]
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);  // [1, 0, 2, 0, 3, 0, 4, 0]
// How many zeros we have?
        int size = list.size();
        list.removeAll(Arrays.asList(0)); //
        System.out.println(list);  // [1, 2, 3, 4]
        int newSize = list.size();
        int totalNumberOfZeros = size - newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros); // totalNumberOfZeros = 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);  //  [1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println("------------------------------");
//2)     // if we want to create new ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
           if (each!=0){
               result.add(each);
           }
        }
        System.out.println(result);  // [1, 2, 3, 4]
        for (Integer each : list2) {
            if (each==0){
                result.add(each);
            }
        }
        System.out.println(result);  //[1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println("------------------------------------------");

// 3) write  a program that can extract the special characters, digits and letters from a String
// and store them into separate ArrayList // Ex: str = "ABD123$%#@&456EFG!"
// Output: list1 : {1,2,3,4,5,6}  list2 : {A,B,C,D,E,F,G} list3 : {$,%,#,@,&,!}

        String str = "ABD123$%#@&456EFG!";
        String[] array =  str.split(""); // it converts to a String Array
        System.out.println(Arrays.toString(array));
        char[] ch =    str.toCharArray(); // it converts to a primitive Array
        System.out.println(Arrays.toString(ch)); //[A, B, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

// to convert to a ArrayList
        ArrayList<Character> chars = new ArrayList<>();// we used wrapper class bcs ArrayList does not support primitives
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println("chars = " + chars); //chars = [A, B, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        ArrayList<Character> letters = new ArrayList<>();
        for (Character each : chars) {
            if (Character.isLetter(each)){
                letters.add(each);
            }
        }
        System.out.println("letters = " + letters); //letters = [A, B, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>();
        for (Character each : chars) {
            if (Character.isDigit(each)){
                digits.add(each);
            }
        }
        System.out.println("digits = " + digits); //digits = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars = new ArrayList<>();
        for (Character each : chars) {
            if (!Character.isLetterOrDigit(each)){
                specialChars.add(each);
            }
        }
        System.out.println("specialChars = " + specialChars); //specialChars = [$, %, #, @, &, !]
// Second Solution for Task-3:
        // after converting Character Arraylist we can continue like this
        ArrayList<Character> letters2 = new ArrayList<>(chars); // we get all the characters from chars ArrayList
        letters2.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters2 = " + letters2); // letters2 = [A, B, D, E, F, G]

        ArrayList<Character> digits2 = new ArrayList<>(chars);
        digits2.removeIf(p-> ! Character.isDigit(p));
        System.out.println("digits2 = " + digits2); // digits2 = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars2 = new ArrayList<>(chars);
        specialChars2.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("specialChars2 = " + specialChars2); // specialChars2 = [$, %, #, @, &, !]
        // another way to get specialChars2 from chars
        specialChars2.removeAll(letters2);
        specialChars2.removeAll(digits2);
        System.out.println("specialChars2 = " + specialChars2); // specialChars2 = [$, %, #, @, &, !]














    }
}
