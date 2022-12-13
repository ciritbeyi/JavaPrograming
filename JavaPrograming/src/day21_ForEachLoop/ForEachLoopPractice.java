package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {
        String[] words = {"Java Programing", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String word : words) {
            System.out.println(word.charAt(0) + " " + word.charAt(word.length()-1));
        }




    }
}
