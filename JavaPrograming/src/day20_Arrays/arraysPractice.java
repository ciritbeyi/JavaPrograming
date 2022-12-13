package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysPractice {
    public static void main(String[] args) {
/// store the elements : 10,20,50,70
    int[] number = {10,20,50,70}; // size:4

        System.out.println(Arrays.toString(number));   // [10, 20, 50, 70]
        System.out.println("--------------------------------------------------------------");
// create a variable that contains 5 scores

    int [] scores = new int[5];  //
        System.out.println(Arrays.toString(scores)); // [0, 0, 0, 0, 0]
        scores[1]=85;
        scores[3] = 75;
        scores[scores.length-1] = 95;
        scores [3]=75;
        scores[0]=65;
        scores[2]=55;
        System.out.println(Arrays.toString(scores)); // [65, 85, 55, 75, 95]
System.out.println("--------------------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "July", "Juli", "August",
                "September", "October", "November", "December"};  // 0 ~ 11 (length - 1)

        System.out.println( months[0] );
        System.out.println( months[1] );
// aylari alt alta yazdirmak istersek:
        for (int i = 0; i < 12; i++) { // 12 yerine months.length  yazabilirim
            System.out.println(months[i]); // i:represents the index number of array starting from 0
        }
System.out.println("--------------------------------------------------------------");
// aylari tersten yanyana arada bosluk olarak yazdirmak istersek
        for (int i = months.length-1; i >=0 ; i--) { // i:represents the index number of array starting from last index
            System.out.print(months[i] + " "); //December November October September August Juli July May April March February January

        }





    }

}
