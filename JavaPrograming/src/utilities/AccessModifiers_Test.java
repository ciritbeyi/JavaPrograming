package utilities;

import day34_CarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData); // default is not visiable outside the package
        //  System.out.println(AccessModifiers.privateData); // private is not visible outside the class



        AccessModifiers.method1();
     //   AccessModifiers.method2();//// default is not visiable outside the package
        //  AccessModifiers.method3();// private is not visible outside the class



    }
}
