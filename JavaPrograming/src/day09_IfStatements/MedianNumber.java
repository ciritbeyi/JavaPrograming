package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,  b = 20,  c = 30;  // three different integer numbers
/*
        if (a < b && a < c){
            System.out.println(a + " is the median number");
        }
        if (b < a && b<c){
            System.out.println(b + " is the median number");
        }
        if (c<a && c<b){
            System.out.println(c + " is the median number");
        }
*/
        boolean aIsMedian = (a>b &&a<c) || (a>c && a<b);
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;  //boolean cIsMedian = (c>a && c<b)  || (c>b && c<a);
// if we have 3 different numbers, one must be maximum, one Must be minimum and one MUST be Median number.
        if (aIsMedian){
            System.out.println(a+ " is median number");
        }
        if (bIsMedian){
            System.out.println(b + " is median number");
        }
        if (cIsMedian){
            System.out.println(c + " is median number");
        }
    }
}
