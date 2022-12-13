package day14_String;

import java.util.Scanner;

public class DomainOfEmail_Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your E-mail:");
        String eMail = input.nextLine();
        System.out.println("eMail = " + eMail);

        String str1 = eMail.substring(eMail.indexOf("@")+1 , eMail.lastIndexOf("."));
        System.out.println("str1 = " + str1);
        System.out.println("-------------------");
        int beginningIndex = eMail.indexOf("@")+1;
        int endingIndex = eMail.lastIndexOf(".");
        String str2 = eMail.substring(beginningIndex , endingIndex);
        System.out.println("str2 = " + str2);
        System.out.println("-------------------");
        String str3 = "Java is fun, Java is cool";
        String s1 = str3.substring(0 , 10+1);  // Java is fun
        System.out.println("s1 = " + s1);  //  s1 = Java is fun

        int beg = str3.lastIndexOf("J");
        String s2 = str3.substring(beg);//  Java is cool
        System.out.println("s2 = " + s2); //   s2 = Java is cool



        input.close();
    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)
		Ex:
			email = Cydeo.School@gmail.com
		output:
			gmail
			email = "School.Cydeo@yahoo.com
		output:
			yahoo
 */