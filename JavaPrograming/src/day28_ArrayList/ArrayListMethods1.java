package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        // add()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // it adds after the last index
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);  // [10, 20, 30, 40, 50, 60]
        numbers.add(2,25);
        System.out.println(numbers);   // [10, 20, 25, 30, 40, 50, 60]

        System.out.println(numbers.size()); // 7

        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);  // 6

        Integer num = numbers.get(3);
        int num2 = numbers.get(3);

        System.out.println("num = " + num);  // num = 30
        System.out.println("num2 = " + num2);  //  num2 = 30

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");  //10 20 25 30 40 50 60
        }
        System.out.println("---------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Java");
        list.add("Ruby");
        System.out.println(list);  // [Java, Python, C#, Java, Ruby]

        list.set(3,"JavaScript");
        System.out.println(list);  // [Java, Python, C#, JavaScript, Ruby]
        System.out.println("---------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ozgur");
        employees.add("Ali");
        employees.add("Kenan");
        employees.add("Ediz");
        employees.add("Furkan");
        employees.add("Zeynep");
        employees.add("Zehra");

        System.out.println(employees); //[Ozgur, Ali, Kenan, Ediz, Furkan, Zeynep, Zehra]
        employees.remove(0);
        System.out.println(employees); // [Ali, Kenan, Ediz, Furkan, Zeynep, Zehra]
        employees.remove(0);
        System.out.println(employees);  // [Kenan, Ediz, Furkan, Zeynep, Zehra]
        employees.remove(employees.size()-1);  // to remove the last index
        System.out.println(employees);  // [Kenan, Ediz, Furkan, Zeynep]

        employees.remove("Furkan");
        // if the employees consist "Furkan" it will be removed.if there are moe than one "Furkan" first one will be removed
        System.out.println(employees);  //  [Kenan, Ediz, Zeynep]
        boolean r1 = employees.remove("Ediz");
        // remove () returns as a boolean. we can assign it  to a boolean variable
        System.out.println(employees);  // [Kenan, Zeynep]
        System.out.println("r1 = " + r1); //  r1 = true







    }
}
