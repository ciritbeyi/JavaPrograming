package day37_Inheritance;

class  A {
    public A(int a){  // constructor with parameter
        System.out.println("A");
    }

}

class B extends A {
    public  B(){
      super(9);  // if the Parent class's constructor is not default=> we MUST call manually at here (at first step) the constructor of class A
        // (Onl a constructor call a constructor call a constructor + it must be with super() keyword + it must be at the first step of the child class's constructor
        System.out.println("B");
    }

}

public class ConstructorPractice {

    public static void main(String[] args) {
        B obj = new B();
    } // when we create an object the constructors will be automatically executed, => output will be :  A   B
}
