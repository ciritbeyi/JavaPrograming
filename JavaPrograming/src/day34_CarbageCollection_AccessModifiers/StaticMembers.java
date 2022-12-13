package day34_CarbageCollection_AccessModifiers;

public class StaticMembers {  // Outer class : it has public access modifier / Outer class can not be static

    static class class1 {  // Inner class : it has default access modifier / Only inner class can be static

    }  // Inner class

    public static int num = 100;     // static variable
    public static void method() {   // static method

    }

    static {  // static block

    }

} // Outer class


class  A { // Outer clas
    static  class B {  // Inner clas
        public  static  void Method1(){

        }
    } // inner class
} // outer class

class C {
    public static void main(String[] args) {
        A.B.Method1();  // calling through the class name
    }
}
