package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandir", "Python", "Python", "Ozgur", "Ediz", "Ediz" };


        for (String each : words) { // Outer loop to access to each element
            int count = 0;
            for (String element : words) { // Inner loop to find the frequency of each element
                if (element.equals(each))
                count++;
            } // Inner loop closing
            if (count == 1){
                System.out.println(each);
            }
        }// Outer loop closing
    }
}
