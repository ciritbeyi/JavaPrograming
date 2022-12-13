package day34_CarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static  double pi;
    public static String name;
    public static ArrayList<Integer> numbers;


    public Circle(double radius){
        this.radius = radius;
       // pi = 3.14; // it is not an error but NOT efficient. bcs one time is enough
    }

    static {
       // radious = 5; // static block  does not accept instance variables
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
    */







}
