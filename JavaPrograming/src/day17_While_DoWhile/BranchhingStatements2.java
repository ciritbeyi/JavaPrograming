package day17_While_DoWhile;

public class BranchhingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E';  i++) {
            if (i =='C'){
                continue;   // it skips 'C'
            }

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 0; i <= 10 ; i++) {
            if (i%2 != 0) {   //odd numbers  will be skipped
                continue;  //  Skip
            }
            System.out.print(i + " ");  // 0 2 4 6 8 10
        }
        System.out.println("-------------------------");
        for (int i = 0; i <= 10 ; i++) {
            if (i%2 == 0) {    // even numbers will be skipped
                continue;
            }
            System.out.print(i + " ");  //  1 3 5 7 9
        }

int whole = 113.142<20? 20 : 10;

    }
}
