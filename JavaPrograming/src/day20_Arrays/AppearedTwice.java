package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A','A','A', 'B','C','C', 'D','D','D' };

        for (int j = 0; j < chars.length; j++) { // Outer loop to repeat inner loop, to find the frequency of all elements
        char ch = chars[j];
        int frequency = 0;

            for (int i = 0; i < chars.length; i++) { // inner loop to find the frequency of one element
                if (chars[i] == ch) {
                    frequency++;
                }
            } // inner loop closing
                if (frequency == 2) {
                    System.out.println(ch);
                }
        } //Outer loop closing
    }
}
