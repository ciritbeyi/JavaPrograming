package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;   //	double > float > long > int > short > byte
        short b = a;  // short is larger than byte so, it can be directly assigned.
        short c = (short)a;  //Compiler at the background  does (short) automatically.
        int d = c; // int c = (int)c  Compiler at the background  does (short) automatically.
        int e = (int)c;  // int yazisinin siyah olmasi bu islemin zaten otomatik olarak yapildigini gosterir.

        System.out.println("----------------------------");
        int x = 55;
        short y = (short)x;  // if we want to castle bigger to smaller we must do manually.
        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short) j;
        System.out.println(j + " : " + k); // 1000000 short icinde olmadigi icin bize baska bir deger verecek.

        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + ": " +s);
        System.out.println("----------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;  // expilicit casting yyapmanin kisa yolu : burada curser ; sagina getirip ALT + Enter yaparsak Cast to `short` secenegi cikar.

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;



    }
}
