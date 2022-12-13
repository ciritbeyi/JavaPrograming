package day01_JavaIntro;

import utilities.StringUtility;
import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {
    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaabbbbbbbbbbbbbbb";
// In order to use a method which we created in another package ==> we can call it through the package name.
// when we type the package name and put a dot it will show us the methods in that package.
// when we chose the method, it will import the method. we will see in the current package
        str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);  //ab


        String name = "Java Programing";

       String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);  // gnimargorP avaJ

        System.out.println("------------------------------------------------");

        String str1 = "Wooden Spoon";
        StringUtility.printEachChar(str1);

        System.out.println("------------------------------------------------");
        String s3 = "123";
        int i1 = Integer.parseInt(s3);
        Integer x = Integer.valueOf(s3);   // Integer // we convert Strint to Integer by using value method
//       integer  =        integer      => it is not Autoboxing or Nonboxing  (there is no primitive here)
        int y = Integer.valueOf(s3);  // it is unboxing => we have both primitive and wrapper

        System.out.println(i1+2);
        System.out.println(x+2);

        String s4 = "4.5";
        Double z = Double.valueOf(s4);
        double z2 = Double.valueOf(s4);
       // Double z = Double.valueOf(s4);

        System.out.println(z + 1);  // 5.5




    }// main

} // class
