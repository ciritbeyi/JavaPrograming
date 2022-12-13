package day34_CarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static  int defaultData = 200; // access modifier: default
    private static int privateDta = 300;

    public static void method1(){
        System.out.println("public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){

    }





    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateDta);



    }

}
