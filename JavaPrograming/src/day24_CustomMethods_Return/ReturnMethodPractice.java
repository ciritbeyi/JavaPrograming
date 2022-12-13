package day24_CustomMethods_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

      // find the max number between 100 & 200
       int maxNumber =  max(100, 200); // asagida yazdigimizmethod un sonucunu burada bir variable a assing ettik.
        System.out.println(maxNumber);  // istersek sonnucu burada yazdirabiliriz

      // multiply the max number by 2
        int multiplication = maxNumber*2;
        System.out.println(multiplication);  // istersek burada bu variable ile baska islem yapabiliriz

    }

    public static int max (int num1, int num2){
        int result = 0;
        if (num1>num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }


}
