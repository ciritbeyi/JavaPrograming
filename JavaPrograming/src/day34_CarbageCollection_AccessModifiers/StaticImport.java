package day34_CarbageCollection_AccessModifiers;

import static day34_CarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(pi); // static import yaptigimiz icin buraya direk olarak pi yazabiliyoruz.
        System.out.println(Circle.pi); // withouth import-> we should call through the class name

    }





}
