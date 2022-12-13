package day27_Wrapper_Classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // int  // we convert Strint to int by using parse method
//         int  =        int      => it is not Autoboxing or Nonboxing  (there is no wrapper here)

        System.out.println(num + 1);//  124
        System.out.println(str + 1);//   1231

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);  // 11.5

        int max = Integer.MAX_VALUE;  // MAX_VALUE is not a method, it is a variable
        int min = Integer.MIN_VALUE;   // MIN_VALUE is not a method, it is a variable
        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("min = " + min);  // min = -2147483648
        System.out.println("max = " + max); //  max = 2147483647
        System.out.println("min2 = " + min2);  // min2 = -9223372036854775808
        System.out.println("max2 = " + max2); //  max2 = 9223372036854775807

        String s1 = "true";
        String s2 = "maybe";
        boolean r1 = Boolean.parseBoolean(s1);
        boolean r2 = Boolean.parseBoolean(s2);
        System.out.println(r1);  // true
        System.out.println(r2);  // false

        System.out.println("-----------------------------------------------");
        String s3 = "123";
        Integer x = Integer.valueOf(s3);   // Integer // we convert Strint to Integer by using parse method
//       integer  =        integer      => it is not Autoboxing or Nonboxing  (there is no primitive here)
        int y = Integer.valueOf(s3);  // it is unboxing => we have both primitive and wrapper

        String s4 = "4.5";
        Double z = Double.valueOf(s4);
        System.out.println(z + 1);  // 5.5
        System.out.println("-----------------------------------------------");

        // isDigit()   //  isLetter()  //  isLetterOrDigit()  // isUpperCase()  //  isLowerCase()
        char ch1 = '0';
        char ch2 = 'A';
        char ch3 = '!';
        boolean r3 = Character.isDigit(ch1);  // return as a bolean
        System.out.println(r3); // true
        boolean r4 = Character.isLetter(ch2);
        System.out.println(r4); // true
        boolean r5 = Character.isLetterOrDigit(ch3);
        System.out.println(r5);  // false
        boolean r6 = Character.isUpperCase(ch2);
        boolean r7 = Character.isLowerCase(ch2);
        System.out.println(r6); // true
        System.out.println(r7); // false
        System.out.println("-------------------------------");
        String s = "ab1cd2efg3hj4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each) == true) {
                //sum += each;  //  sum = 202  because they are still char and value from ASCII will be taken
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum); //  sum = 10


    }
}
