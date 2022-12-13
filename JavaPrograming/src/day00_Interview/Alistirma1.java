package day00_Interview;

public class Alistirma1 {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//When byte and short data types are used in arithmetic operations, they are evaluated as int data type temporarily
//        byte c = a + b; //!!!COMPILE ERROR
        int d = a + b;

        short a1 = 10;
        short b1 = 20;
//        short c = a1 + b1; //!!!COMPILE ERROR
        int d1 = a + b;

        System.out.println("================= && and || operators ===================================");
//  && and || operators provide "short-circuit"
        int x = 1;
        System.out.println( (x > 4) && (++x == 4) ); //false : && "short-circuit"=> (++x == 4) will NOT evaluated
        System.out.println( x ); //1
        System.out.println( (x > 4) & (++x == 4) ); //false  : &  "NO short-circuit"=> (++x == 4) will BE  evaluated
        System.out.println( x ); //2

        int y = 1;
        System.out.println( (y > 0) || (++y == 4) ); //true : && "short-circuit"=> (++x == 4) will NOT evaluated
        System.out.println( y ); //1
        System.out.println( (y < 0) | (++y == 1) ); //false : &  "NO short-circuit"=> (++x == 4) will BE  evaluated
        System.out.println( y ); //2

        System.out.println("====================================================");

        int w = 2;
        System.out.println( ++w == 2 || --w == 2 && --w == 2 ); //false

        System.out.println("===================== to find the greatest number ===============================");

//write an if-else statement to find the greatest number : SOLUTION 1
        int k = 1;
        int l = 2;
        int m = 3;

        if (k>l && k>m){
            System.out.println(k + " is greatest");
        } else if (l>k && l>m) {
            System.out.println(l + " is greatest");
        }else {
            System.out.println(m + " is greatest");
        }
 //write an if-else statement to find the greatest number : SOLUTION 1
       // In Java, the ternary operator is a type of conditional operator

        int x1=69;
        int y1=89;
        int z=79;
        int largestNumber = (x1 > y1) ? (x1 > z ? x : z) : (y1 > z ? y1 : z);
        System.out.println("The largest numbers is: "+largestNumber);
//  Okuyamiyorum ???
        System.out.println("============= sum of  all , odd and even numbers  ==============================");

//Write a program to display sum of numbers between 1 and 100
        int result = 0;
        for (int i = 1; i < 101; i++) {
            result += i; // result = result + i;  we can type like this as well
        }
        System.out.println("result = " + result);
//Write a program to display sum of odd and even numbers between 1 and 100
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 1; i < 101; i++) {
            if (i%2 == 0){
                sumOfEven+=i;
            } else {
                sumOfOdd +=i;
            }
        }
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);

        System.out.println("=============== factorial =====================================");

//Write a program to find the factorial value of 5
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *=i;
        }
        System.out.println("factorial = " + factorial);

        System.out.println("=============== Yildizli dikdortgen =====================================");


        for (int i = 0; i < 6 ; i++) { // Outer loop : number of lines
            for (int j = 0; j < 4; j++) { // Inner loop : number of * in one line
                System.out.print("*");
            }
            System.out.println(); // in order to go next line after writing ****
        }
        System.out.println("============= Sola yasli asagi dogru ARTAN yildiz  =======================================");

        for (int i = 0; i < 6 ; i++) { // Outer loop : number of lines
            for (int j = 0; j <= i ; j++) { // Inner loop : number of * in one line
                System.out.print("*");
            }
            System.out.println(); // in order to go next line after writing number of * in one line
        }
        System.out.println("============ Sola yasli asagi dogru AZALAN yildiz ========================================");

        for (int i = 0; i < 6; i++) { // Outer loop : number of lines
            for (int j = i; j < 6; j++) {  // Inner loop : number of * in one line
                System.out.print("*");
            }
            System.out.println();// in order to go next line after writing number of * in one line
        }
        System.out.println("============= Sola yasli asagi dogru ARTAN rakam yazimi =======================================");
        for (int i = 1; i <= 6 ; i++) { // Outer loop : number of lines
            for (int j = 1; j <= i ; j++) { // Inner loop : numbers in one line
               // System.out.print(i); // i : olursa satir sayisi kadar ayni rakami yazar
                System.out.print(j); // j : olursa o satirda satir sayisina kadar yazar
            }
            System.out.println(); // in order to go next line after writing number of * in one line
        }
        System.out.println("============= Sola yasli asagi dogru AZALAN rakam yazimi =======================================");

        for (int i = 6; i >= 1 ; i--) { // Outer loop : number of lines
            for (int j = 1; j <= i ; j++) { // Inner loop : numbers in one line
                // System.out.print(i); // i : olursa satir sayisi kadar ayni rakami yazar
                System.out.print(j); // j : olursa o satirda satir sayisina kadar yazar
            }
            System.out.println(); // in order to go next line after writing number of * in one line
        }
        System.out.println("=========Sola yasli asagi dogru ARTAN ve asagi dogru AZALAN rakam yazimi ===========================================");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("============ Sonu rakamli asagi gogru azalan *  ========================================");

        for (int i = 1; i <= 6 ; i++) { // Outer loop : number of line
            for (int j = 6-i; j >= 1 ; j--) { // Inner loop: number of * in one line
                System.out.print("*");
            }
            System.out.println(i); // sondaki rakam
        }

        System.out.println("================= Ters Ikiz kenar Ucgen ===================================");

        for (int i = 6; i >= 1; i--) { // Outer loop : umber of lines
            for (int j = i; j < 6 ; j++) { // Inner loop1 : number of spaces in one line
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) { // Inner loop2: number of * in one line
                System.out.print("* "); // space is important after *
            }
            System.out.println();// to go to next line
        }






    }
}
