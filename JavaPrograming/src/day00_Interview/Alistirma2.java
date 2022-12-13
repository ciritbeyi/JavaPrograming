package day00_Interview;

public class Alistirma2 {
    public static void main(String[] args) {

        int x = 10, y = 20;
// 1- In method overloading, if there is no exact matching data types, one data type can promote to another data type.
// the argument "int y" is promoted to long data type
        add(x,y);
/*  ASAGIDAKI METODLAR BOYLE OVERLOAD EDILMIS OLSAYDI  add(x,y);
Both of these methods are eligible for type promotion
At this point, JVM doesn't know which method to be executed. => So it gives a compile error!!

public static void add(int x, long y){ //overloaded method with int and long
System.out.println(x + y);
System.out.println("integer and long");
}
public static void add(long x, int y){ //overloaded method with long and int
System.out.println(x + y);
System.out.println("long and integer");
}

 */







    } // main
    public static void add(int x){ //method with one int
        System.out.println(x);
        System.out.println("integer");
    }
    public static void add(int x, long y){ //method with int and long
        System.out.println(x + y);
        System.out.println("integer and long");
    }


}
