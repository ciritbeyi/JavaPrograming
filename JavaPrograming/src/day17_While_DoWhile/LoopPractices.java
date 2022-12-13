package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {   // for known reputations for loop IS THE BEST
            System.out.print(i+"");  // 12345678910
        }
        System.out.println("------------------------");
       int j = 1;
        while (j <=10) {
            j++;    //  Logical error    /  it will start from 2
            System.out.print(j+"");    //234567891011
        }
        System.out.println("------------------------");
        int k = 1;
        while (k <=10) {   // can also be done by while loop but NOT best one
           //   k++;  246810   //Logical error    /  it will start from 2
           System.out.print(k+"");    //  12345678910
            k++;   //  if we don't use this it will print infinite
        }
        System.out.println("------------------------");
      int m = 1;
        do {
          //  m++;   // 246810   Logical error    /  it will start from 2
           System.out.print(m+"");     // 12345678910
            m++;  // if we don't use this it will print infinite
        } while (m<=10);




    }
}
