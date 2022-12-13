package day32_Constructors;

import java.util.concurrent.Callable;

public class ConstructorCalls {

    public ConstructorCalls(){
       // this();  // compile error Rule-5
       // this(9)  // compile error Rule-5 : second one already consist first one
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
       // this(); // calling MUST be at first line
       // ConstructorCalls() // // compile error Rule-1
    }

    public ConstructorCalls(String str){
        this(8);
        //this(); // compile error Rule-3 and 4
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
       ConstructorCalls obj1 = new ConstructorCalls();
       //Default Constructor
        System.out.println("---------------------");
        ConstructorCalls obj2 = new ConstructorCalls(10);
        //Default Constructor
        //Constructor with int argument
        System.out.println("---------------------");
        ConstructorCalls obj3 = new ConstructorCalls("Waldmohr");
        //Default Constructor
        //Constructor with int argument
        //Constructor with String argument



    }






}
