package day20_Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python", "Ozgur" };

        for (int j = 0; j < words.length; j++) { // Outer loop to repeat inner loop for each element

            String element = words[j];  // "Java"
            int frequency = 0;
            for (int i = 0; i < words.length; i++) { // Inner loop to find the frequency of one element
                if (words[i].equals(element)) {
                    frequency++;
                }
            } // Inner loop closing

            if (frequency==1){
                System.out.print(element + " ");  // C# Ozgur
            }
        }  // Outer loop closing
    }
}
