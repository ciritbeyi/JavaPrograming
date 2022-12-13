package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) { // i : indexes of array
            int eachElement = numbers[i]; // there is 2 step: first go to index number, second go to element
            System.out.println(eachElement);
        }
        System.out.println("------------------------------");
// Sadece basindan sonuuna kadar yapacak isek bu daha avantajli
        for ( int each : numbers) {  //only one step directly go to element / each: elements of array
            System.out.println(each);
        }




    }
}
