package day20_Arrays;


import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

// create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5];
        int[] degres = new int[5];

        System.out.println(myGroup);  // hascode / we can not print like this => [Ljava.lang.String;@27f674d
        System.out.println(Arrays.toString(myGroup));  // correct way => [null, null, null, null, null]
        System.out.println(Arrays.toString(degres));  //  [0, 0, 0, 0, 0]
        // parantez icine Arrays yazip Enter yaptigimizda yukarida import java.util.Arrays; gelecek.
        // Takiben nokta koyup, toString() metodunu sececegiz.

// Assigning values to Array Elements => we know how many elements are there, but we don't know what are they exactly
        myGroup[0] = "Ediz";
        myGroup[1] = "Zeynep";
        myGroup[2] = "Zehra";
        myGroup[3] = "Ali";
        myGroup[4] = "Ozgur";  // bu degeri yazmayacak cunku [4] u  "Yusuf" olarak reassign ettik
        myGroup[4] = "Yusuf";
        // myGroup [5] = "Kenan";  // bu durumda => Error Exception    Index 6 out of bounds for length 5

        System.out.println(Arrays.toString(myGroup));  // [Ediz, Zeynep, Zehra, Ali, Yusuf]

        System.out.println("---------------------------------------------------------");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index             0         1           2           3          4          5             6
        System.out.println(Arrays.toString(days)); // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        int number = 5;
        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number - 1]);  // Friday

        System.out.println("---------------------------------------------------------");
        String[] months = {"January", "February", "March", "April", "May", "July", "Juli", "August",
                "September", "October", "November", "December"};

        int num = 4;
        if (num < 1 || num > 12) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[num - 1]); //  April






    }
}
