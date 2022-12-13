package day32_Constructors;

public class Test {

    public Test(){
        System.out.print("A ");
    }

    public Test(int a){  // A B
        this();
        System.out.print("B ");
    }

    public Test(double a){  // A B C
        this(10);
        System.out.print("C ");
    }

    public  Test(String str){  //  A B C D
        this(2.5);
        System.out.print("D ");
    }

    public static void main(String[] args) {
        new Test("Java"); // A B C D
    }







}
