package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,5,5,5,5,8,8,8,8));
        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8, 8]

        list.removeAll(Arrays.asList(3,5,8)); // it will remove all of these elements
        System.out.println(list); //  [1, 2, 4, 6, 7, 9, 10]
        System.out.println("------------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));
        System.out.println(numbers); //[100, 200, 300, 400, 500, 600, 700, 800, 900]

        numbers.retainAll(Arrays.asList(100,200,300));// it will remove all NON-MATCHED elements
        System.out.println(numbers); //[100, 200, 300]
        System.out.println("------------------------------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);  // [QA, SDET, QA, SDET]
        System.out.println("------------------------------------------------------------------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10); // contains() allows to check only one
        boolean r2 = nums.contains(2)  && nums.contains(5)  && nums.contains(10);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));
        boolean r4 = nums.containsAll(Arrays.asList(2,5,100));

        System.out.println("r1 = " + r1); // r1 = true
        System.out.println("r2 = " + r2); // r2 = true
        System.out.println("r3 = " + r3); // r3 = true
        System.out.println("r4 = " + r4); // r4 = false
        System.out.println("------------------------------------------------------------------------");
// ADDING NON-PRIMITIVES TO AN ArrayList
        String[] names = {"Ozgur", "Ali", "Kenan", "Ediz", "Zeynep", "Furkan"};
        ArrayList <String> namesList = new ArrayList<>();
        //namesList.addAll( names);  // compile error bcs: Bulk Operations: argument MUST be a collection type
        namesList.addAll(Arrays.asList(names));  // can be done like this: with asList()
        System.out.println(namesList);  //  [Ozgur, Ali, Kenan, Ediz, Zeynep, Furkan]

        ArrayList <String> namesList1 = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList1); //  [Ozgur, Ali, Kenan, Ediz, Zeynep, Furkan]
        System.out.println("------------------------------------------------------------------------");
// ADDING PRIMITIVES TO AN ArrayList
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));   // it gives error bcs it is a primitive array
//        // bcs: ArrayList dos not support primitives
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5));  // single element can be added but multiple can not
        System.out.println(list3);  // [5]
        list3.add(8);  // we can add single int element => to add all int elements we need a loop
        System.out.println("list3 = " + list3); // list3 = [5, 8]

        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr1));   // it can be done bcs it is not a primitive array
        System.out.println(list4);  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// ADDING PRIMITIVE array TO AN ArrayList => we create a custom method
        ArrayList<Integer> list5 = new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println("list5 = " + list5);  //list5 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]



    } // main
// ADDING PRIMITIVE array TO AN ArrayList => we create a custom method
    public static ArrayList<Integer> convertArrayToArrayList (int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }


} // class
