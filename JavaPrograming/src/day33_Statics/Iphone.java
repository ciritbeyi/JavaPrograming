package day33_Statics;

public class Iphone {

    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String color;
    public  String size;
    public  static String madeIn = "China";
    public  static boolean hasBattery = true;
    public  static boolean isTouchScreen = true;
    public  static boolean hasFaceTime = true;

    public static void printModelAndPrice(){
  //      System.out.println(model + " : " + price); // compile eror bcs model and price are instance variables
    }

    public  void printOperatingSystem(){
        System.out.println(OS);
    }
    public  static void printOperatingSystem1(){
        System.out.println(OS);
    }







}
