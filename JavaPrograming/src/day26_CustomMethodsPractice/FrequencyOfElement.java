package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {

        int [] arr = {1,1,1,1,1,2,2,2,3,3,3,4,4,1,1,1,1};
        int count = frequencyOfElement(arr,1);
        System.out.println("count = " + count);  // 9


    } // main
// returns the frequency of the given int element in the given int array
    public static int frequencyOfElement (int []array , int element){
        int count = 0;
        for (int each : array ) {
            if ( each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given double element in the given double array
    public static int frequencyOfElement (double []array , double element){
        int count = 0;
        for (double each : array ) {
            if ( each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given char element in the given char array
    public static int frequencyOfElement (char []array , char element){
        int count = 0;
        for (char each : array ) {
            if ( each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given String element in the given String array
    public static int frequencyOfElement (String []array , String element){
        int count = 0;
        for (String each : array ) {
            if ( each.equals(element)) {
                count++;
            }
        }
        return count;
    }







} // end of class

/*
1.1 Create a method that passes two parameters: an integer array and an Integer element.
The method returns the frequency of the given integer element from the integer array

1.2 Create a method that passes two parameters: a double array and a double element.
The method returns the frequency of the given integer from the array

1.3 Create a method that passes two parameters: a char array and a char element.
The method returns the frequency of the given char element from the char array

1.4 Create a method that passes two parameters: a String array and a String element.
The method returns the frequency of the given String element from the String array

 */