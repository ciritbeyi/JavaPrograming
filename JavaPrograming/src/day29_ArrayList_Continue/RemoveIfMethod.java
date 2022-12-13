package day29_ArrayList_Continue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("list = " + list);//list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]
/*
// to remove according to index number does not work properly bcs in collection size is dynamic
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2  != 0){
                list.remove(i); // to remove according to index number does not work properly bcs in collection size is dynamic
            }
        }
        System.out.println("list = " + list); // list = [2, 4, 6, 8, 1, 2, 4, 6, 8, 1, 2, 4, 6, 8]
*/

        list.removeIf(p -> p % 2 ==0 );  // Lambda Expression  ->
        System.out.println("list = " + list); // list = [1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5, 7, 9]
        list.removeIf(p -> p < 5 );  // Lambda Expression  ->
        System.out.println("list = " + list); // list = [5, 7, 9, 5, 7, 9, 5, 7, 9]
        System.out.println("-------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each %2 ==0);
        System.out.println("list2 = " + list2); // list2 = [1, 3, 5, 7, 9]
        System.out.println("-------------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Jav", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J"));

        System.out.println("list3 = " + list3);  // list3 = [Python, C#, C++]
        System.out.println("-------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java","Python", "Cydeo"));

        names.removeIf(name -> StringUtility.isPalindrome(name));

        System.out.println("names = " + names); // names = [Java, Python, Cydeo]






    }
}
