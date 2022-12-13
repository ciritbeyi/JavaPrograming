package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
      int [] nums = {1,2,3,4,5};
      String str = "Java";

        System.out.println(str.toString());  // Java  / manually type .toString()
        System.out.println(str); // Java   implicitly has .toString()
        System.out.println(nums);   // [I@27f674d  / hashcode
        System.out.println(nums.toString());    // [I@27f674d
        System.out.println(Arrays.toString(nums));  //[1, 2, 3, 4, 5]  // .toString() should be called explicitly
        System.out.println(nums[0]); // 1  / printing out the element

        System.out.println("----------------------------------------------------");

        int [] scores = {95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));  // [95, 100, 55, 65, 85, 78]
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));  // [55, 65, 78, 85, 95, 100]
        System.out.println("Min Score: " + scores[0]); // Min Score: 55
        System.out.println("Max Score: " + scores[scores.length-1]); // Max Score: 100

        String [] names = {"Ozgur", "Ali", "Kenan", "Hatice", "Muzeyyen", "Ediz", "Zeynep", "Zehra", "Yusuf Ali"};
        Arrays.sort(names);  // sorts according to ASCII numbers of the letters and characters as well
        System.out.println(Arrays.toString(names));
        // [Ali, Ediz, Hatice, Kenan, Muzeyyen, Ozgur, Yusuf Ali, Zehra, Zeynep]
        String[] words = {"Ediz", "EDIZ"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));  //  [EDIZ, Ediz]   sorts according to ASCII numbers
        System.out.println("----------------------------------------------------");

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);  //false
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       boolean r2 = Arrays.equals(arr1,arr2);
       System.out.println(r2);  //true
      System.out.println("----------------------------------------------------");
      char[]ch1 = {'a','c', 'b'};
      char[]ch2 = {'b','a', 'c'};
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      boolean anagram = Arrays.equals(ch1,ch2);
      System.out.println("anagram = " + anagram);  //anagram = true





    }
}
