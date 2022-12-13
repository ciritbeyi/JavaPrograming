package day17_While_DoWhile;

public class FrequecyOfWord_WhileLoop {
    public static void main(String[] args) {
     String str = " Java Java Phthon Python";
     int frequency = 0;

     while (str.toLowerCase().contains("java")){
         str = str.replaceFirst("java", "");
         frequency++;
      }
        System.out.println("frequency = " + frequency);
        System.out.println("-------------------------------------");

        String sentence = "cat cat cat cat dog dog dog dpg cat cat";
        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println("countCat = " + countCat);




    }
}
