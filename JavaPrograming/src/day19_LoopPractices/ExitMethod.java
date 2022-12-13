package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i==3) {
            //  break;   // it terminates only the loop
            //  continue;  //  it terminates the current iteration of the loop
                System.exit(0);  // terminates the program
            }
            System.out.print(i);
        }
        System.out.println("Wooden Spoon");
        
   // break; ==>  output: 012Wooden Spoon
   // continue;  ==> output: 0124567Wooden Spoon
  //  System.exit(0);   ==>   output: 012     (It terminates all the statement, in or out the loop)
        
    }
}
