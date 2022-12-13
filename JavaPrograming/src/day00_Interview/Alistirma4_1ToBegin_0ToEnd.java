package day00_Interview;

import java.util.Arrays;

public class Alistirma4_1ToBegin_0ToEnd {
    public static void main(String[] args) {

        int[] array = {1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0};
        moveLeft(array);

        move1L0R(array);



    }//main

//    Q5: Move All Zeroes To The End

    public static void moveLeft(int array[]){
        int[] newArray = new int[array.length];
        int beginning = 0;
        int ending = array.length - 1;

        for (int i = 0; i < newArray.length; i++) {
            if (array[i] == 0){
                newArray[ending] = array[i];
                ending--;
            } else {
                newArray[beginning] = array[i];
                beginning++;
            }

        }
        System.out.println(Arrays.toString(newArray));
    }

//    Q6: Move All Ones To The Beginning, All Zeroes To the End

    public static void move1L0R( int array[]){
        int[] newArray = new int[array.length];
        int beginning = 0;
        int ending = array.length-1;

        for (int i = 0; i < newArray.length; i++) {
            if (array[i] == 0) {  // zeros goes to the end
                newArray[ending] = array[i];
                ending--;
            } else if (array[i] ==1) {  // ones goes to the beginning
                newArray[beginning] = array[i];
                beginning++;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (array[i] != 0 && array[i] != 1){  // numbers which are not zero and one
                newArray[beginning] = array[i];
                beginning++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }

}
