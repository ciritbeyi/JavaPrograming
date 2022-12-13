package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
/*
1. create an Array of String called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */
        String [] countries = {"Japan","Korea","United States","Turkey","United Kingdom","Canada",};

        // converting array to ArrayList:
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        System.out.println("list = " + list); //list = [Japan, Korea, United States, Turkey, United Kingdom, Canada]

        list.removeIf(p-> p.length() >=10);
        System.out.println("list = " + list); // list = [Japan, Korea, Turkey, Canada]

        // converting ArrayList  back to array : First solution : toArray()
        countries = list.toArray(new String[0]); // 0 can be any number
        // The size of the array depends on the ArrayList. The number will be replaced by the size of ArrayList

        System.out.println(Arrays.toString(countries));  // [Japan, Korea, Turkey, Canada]

        // converting ArrayList  back to array : Second solution : loop  (It will have extra steps


    }
}
