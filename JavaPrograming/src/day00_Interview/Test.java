package day00_Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5,6,7));

       for (Integer each : list){
           if (each %2 != 0){
               continue;
           }
           System.out.println(each + " ");
           break;
       }
        System.out.println("------------------------------------");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3,"cyan");

        System.out.println(colors);

        System.out.println("------------------------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        int a =1;
        list1.remove(a);

        System.out.println(list1);
        System.out.println("------------------------------------------");

        ArrayList<Character> list3 = new ArrayList<>();

        for (char i = 'a'; i <= 'z' ; i++) {
            list3.add(i);
        }
        boolean result = list3.containsAll(Arrays.asList('a', 'c','D'));

        System.out.println(result);
        System.out.println("------------------------------------");




    }


    public static void  Test(){

    }
}
