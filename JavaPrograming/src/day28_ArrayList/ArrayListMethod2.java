package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list); // [100, 200, 200, 200, 300, 400, 500]
        int num = 1;
        list.remove(num);  // removes the element at index 1
        System.out.println(list); // [100, 200, 200, 300, 400, 500]
        Integer num1 = 200;
        boolean r1 = list.remove(num1);  // removes the first object (200)
        System.out.println(list); // [100, 200, 300, 400, 500]
       // list.remove(200);  // it considers 200 as an int => so we will get error (IndexOutOfBoundsException)
        System.out.println(r1);  // true  //   boolean means if the given object removed successfully or not.
        Integer num2 = 2000;
        boolean r2 = list.remove(num2);
        System.out.println("r2 = " + r2); // r2 = false // this object does not exist in ArrayList
        System.out.println("-----------------------------");
        System.out.println(list);  //[100, 200, 300, 400, 500]
        list.clear();
        System.out.println(list.size()); // 0
        System.out.println(list);  //  []
        System.out.println("-----------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
       int a = characters.indexOf('A');  //  0
       int b = characters.lastIndexOf('A');  //  4
        System.out.println("a = " + a); // a = 0
        System.out.println("b = " + b);  // b = 4
        System.out.println("-----------------------------");

        boolean r3 = characters.contains('A');
        boolean r4 = characters.contains('Z');
        System.out.println("r3 = " + r3); // r3 = true
        System.out.println("r4 = " + r4);  //  r4 = false















    }
}
