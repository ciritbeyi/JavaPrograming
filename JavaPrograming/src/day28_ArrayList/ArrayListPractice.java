package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number);  //  [10, 20, 30, 40, 50]

        for (int i = 0; i < number.size(); i++) {
           number.set(i,number.get(i)*2);
        }
        System.out.println(number); // [20, 40, 60, 80, 100]




    }
}
/*
{1,2,3,4,5,6}
{2,4,6,8,10,12}
 */