package day00_Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        String str = "Merhaba Ediz";
        String reversed1 = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed1 += str.charAt(i);
        }
        System.out.println(reversed1);

System.out.println("---------------int in tersini almak-------------");
        int num = 12345;
        int numRev = 0;

        while (num > 0){
            numRev = numRev * 10  + num % 10;
            num = num / 10;
        }
        System.out.println(numRev);




/*
System.out.println("-----ArrayList in tersini almak ------");
         int num = 12345;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num%10);
        list.add(num%100/10);
        list.add(num%1000/100);
        list.add(num%10000/1000);
        list.add(num%100000/10000);
        System.out.println(list);

        for (Integer each : list) {
            System.out.print(each + " ");
        }
*/
System.out.println("-----array [] in tersini almak ------");
        int[] nums = {100, 55, 90, 28, 75,45, 42, 50};

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
System.out.println("--------------------------");




    }



}
