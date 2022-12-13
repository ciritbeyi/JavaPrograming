package day00_Interview;

public class Blocks {
    public int x; //instance variable
    public static int y; //static varaible
    //static method
    public static void staticMethod(){
        System.out.println("static method is called from instance block");
    }
    //instance method
    public void instanceMethod(){
        System.out.println("instance method is called from instance block");
    }
    //constructor
    Blocks(){
        System.out.println("constructor is executed");
    }
    //instance block
    {
        System.out.println(x = 10);
        System.out.println(y);
        staticMethod();
        instanceMethod();
        System.out.println("instance block is executed");
    }
    //static block
    static{
        System.out.println( y = 20 );
        System.out.println("static block is executed");
    }
}

