package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        // we will do without using a  loop

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // we copied the scores to gradeOfA
        gradeOfA.removeIf(p-> !(p>=90 && p<=100));  // 90 ~ 100
        System.out.println("gradeOfA = " + gradeOfA);  // gradeOfA = [100, 90]

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p-> !(p >=80 && p <=89));
        System.out.println("gradeOfB = " + gradeOfB); //  gradeOfB = [85, 85]

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p-> !(p>=70 && p<=79));
        System.out.println("gradeOfC = " + gradeOfC); // gradeOfC = [75, 73, 73]

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p-> !(p>=60 && p<=69));
        System.out.println("gradeOfD = " + gradeOfD);  // gradeOfD = [65]

        ArrayList<Integer> gradeOfE = new ArrayList<>(scores); // 0 ~ 59
        gradeOfE.removeIf(p-> !(p<60));
        System.out.println("gradeOfE = " + gradeOfE);  // gradeOfE = [55, 45, 35, 47]

/*  last one can also be like this
ArrayList<Integer> gradeOfE = new ArrayList<>(scores); // 0 ~ 59
        gradeOfE.removeAll(gradeOfA);
        gradeOfE.removeAll(gradeOfB);
        gradeOfE.removeAll(gradeOfC);
        gradeOfE.removeAll(gradeOfD);
         System.out.println("gradeOfE = " + gradeOfE);  // gradeOfE = [55, 45, 35, 47]
 */
        System.out.println("Total number of A: " + gradeOfA.size()); // 2
        System.out.println("Total number of B: " + gradeOfB.size()); // 2
        System.out.println("Total number of C: " + gradeOfC.size()); // 3
        System.out.println("Total number of D: " + gradeOfD.size()); // 1
        System.out.println("Total number of E: " + gradeOfE.size()); // 4





    }
}
