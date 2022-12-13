package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemooveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list) {
            if (!result.contains(each)){ // it returns boolean
                result.add(each);
            }
        }
        System.out.println(result);  //  [10, 20, 30]
        System.out.println("--------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);  // false // because of new keyword
        System.out.println(list1.equals(list2)); //  true  if two arraylists are equal (same elements in same order),
        System.out.println("--------------------------------------");
        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4); // r4 = false
        list1.clear();
        boolean r5 = list1.isEmpty();
        System.out.println("r5 = " + r5); // r5 = true
        System.out.println("--------------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        // Bulk Operation : CollectionType
       // numbers.addAll(1,2,3,4,5,6,7,8)
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(numbers); //  [1, 2, 3, 4, 5, 6, 7, 8]








    }
}
