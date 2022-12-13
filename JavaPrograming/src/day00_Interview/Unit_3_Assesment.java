package day00_Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Unit_3_Assesment {
    public static void main(String[] args) {

// QA:9
        method3(50);  // No answer text provided

        System.out.println("---------------------");

//QA:10
        int result = method4('z', "zebra");  // "z" seklinde yazilmis -> compile error
        System.out.println("result");  //  System.out.println("result"); soruda boyle verilmis
        System.out.println("---------------------");

//QA:10
        System.out.println(method6("mark")); // hashcode  / array oldugu icin toString ile yazdirilacak
        System.out.println(Arrays.toString(method6("mark")));  // [10, 100, 1000, 10000]
        System.out.println("---------------------");

// QA:13
        String str = method7("on the weekend" , 20);
        System.out.println(str); // end  ==> nasil oldu anlamadim
        System.out.println("---------------------");


//QA:16
        double number = add(3.4); // 2.5

        number += add("dual");  // 2.5 + 10 = 12.5
        System.out.println(number);
        number += add(Integer.parseInt("100")); // 12.5 + 5 = 17.5
        System.out.println(number);
        number += add(11341L);  // ??????????? 17.5 + 2.5 = 20
        System.out.println(number);
        number += add(Float.parseFloat("50.8"));  // 20 + 2.5 = 22.5

        System.out.println(number);  // 22.5

//QA:22
        ArrayList<Integer> num = new ArrayList<>();
         num.add(4);
         num.remove(num.size()-1);
        num.add(2);
        num.add(10);
        num.add(0,6);
        num.remove(1);
        num.add(-7);
        num.add(2,2);

        System.out.println(num);
        System.out.println("-----------------");

//QA:23
        ArrayList<String> a = new ArrayList<>();
        a.add("j");
        a.add(0,"1");
        a.add("i");
        a.add(2,"5");
        a.remove(1);
        a.add("e");
        a.add("i");
        a.remove("i");

        System.out.println(a);
        System.out.println("-----------------");


//QA:24
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));

        String s = "";

        for (int i = 0; i < numbers.size(); i++) {
            if (i == 2 || i ==5  || i ==9){
                continue;
            }
            if (numbers.get(i) == 2 || numbers.get(i) % 3 == 0){
                s +="1";
            } else {
                s +="0";

            }
        }
        System.out.println(s);
        System.out.println("-----------------------------------------------------------------");

//QA:25
        ArrayList<String> words = new ArrayList<>(Arrays.asList("during", "storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String word : words) {
            lengths.add(word.length());
        }

        System.out.println(lengths);  //  [6, 5, 4, 4, 6, 6, 4]   ???????????   niye yanlis anlamadim
        System.out.println("------------------------------------------------------------------------------------------");

//QA:26





//QA:27

        String[] cities = {"Boston", "Houston", "Austin", "Lincoln", "Tulsa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(cities));
        int a1 = list.size();

        for (String str1 : list){
            String rev = "";
            for (int i = str1.length()-1; i >=0 ; i--) {
                rev += str1.charAt(i);

            }
            list.set(--a1,rev);
        }
        System.out.println(list);  //[Boston, Houston, nitsuA, notsuoH, notsoB]
        System.out.println("------------------------------------------------------------------------------------------");





    } // main

    public static String method3(int num) {
        String result = "";
        if (num < 0) {
            return "less than 0";
        } else if (num < 50) {
            return "less than 50";
        } else if (num < 100) {
            return  "less than 100";
        } else {
            return "other";
        }

    }


    public  static int method4(char c, String s) {
        if (s.contains("" + c)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static  int[] method6(String str){
        int[] arr = new int[str.length()];
        int n = 10;

        for (int i = 0; i < arr.length; i++) {
            if (n == 20 || n == 50  || n == 70){
                continue;
            }
            arr[i] = n;
            n *= 10;
        }
        return arr;
    }

    public  static  String method7(String str , int s){
        str = str.substring(6);

        if (s <10){
            str = str.substring(8);
        }else {
            if (str.length() > s){
                str = "weekday";

            } else if (s >10 || s == -10) {
                str = str.substring(5);
            }
        }
        return  str;
    }


//QA:16

    public  static int add(int n) {
        return 5;
    }
    public  static double add(double d) {
        return 2.5;
    }
    public  static long add(String s) {
        return 10;
    }



}
