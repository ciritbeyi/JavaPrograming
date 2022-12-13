package day29_ArrayList_Continue;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list); // [1, 1, 2, 3, 3, 4, 5, 5]

        for (Integer each : list) { // Outer loop : to access each element of ArrayList
            int frequency = 0;
            for (Integer element : list) { // inner to determine the frequency of each element
                if (element == each){
                    frequency++;
                }
            } // inner
            if (frequency == 1){
                System.out.println(each); // 2
                break;  // after printing the first unique element it will break exit the loop
            }
        } // outer









    }
}
/*
1. Write a program that can return the first unique elements from an arraylist
	Do not use indexOf & lastIndexOf methods
 */
