package day14_String;

public class StringMedhod2 {
    public static void main(String[] args) {
    String str = "Java is fun, I love learning Java";
    String str2 = str.replace("Java", "Python");
    System.out.println("str2 = " + str2);  //  str2 = Python is fun, I love learning Python

    String email = "JohnSmith@yahoo.com";
    email = email.replace("yahoo", "gmail");  // assigning back
        System.out.println("email = " + email);  //  email = JohnSmith@gmail.com
        String sentence = "Java Java Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "").replace("  "," ");
        System.out.println("sentence2 = " + sentence2);  //  sentence2 = Java Java  C# C# C++ C++
    String s = "Dog Dog Dog Dog Dog Dog";
    s = s.replace("Dog","Cat");
        System.out.println("s = " + s);  //  s = Cat Cat Cat Cat Cat Cat
        String  s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#"," Java");
        System.out.println("s2 = " + s2); //  s2 = C# is fun, Java is cool
        String s3 = "Java";
        s3 = s3.replace("a","e");
        System.out.println("s3 = " + s3); //  s3 = Jeve
        String result = "Java Java Java";
        result = result.replaceFirst("Java","Python");
        System.out.println("result = " + result);  //  result = Python Java Java
        String result3 = "Java";
        result3 = result3.replaceFirst("va","vo");
        System.out.println("result3 = " + result3); //  result3 = Javo







    }
}
