package day34_CarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructor.Student;
import day32_Constructors.Car;
import day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) throws Throwable {
        new GarbageCollection().finalize();


        Car car1 = new Car("BMW");
        car1 = null;
     //   System.out.println(car1);// compile error

        System.out.println("------------");
        Dog dog1 = new Dog();
        dog1.name = "lucy"; // after line 20 it is eligible for garbage collection
        dog1 = new Dog();
        dog1.name = "Max";
        System.out.println(dog1.name);
        System.out.println("------------");

        String language = "Python";
                  language =  "Java";
        System.out.println("------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(200,300,400));

        System.out.println("list1 = " + list1); // list1 = [100, 200, 300, 400]
        System.out.println("list2 = " + list2); // list2 = [100, 200, 300, 400]

        System.out.println(list1 == list2); // true

        System.out.println("-------------------------");
        Student student1 = new Student("Tahir", 45,24, 'M','A');

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("-------------------------");





    }
}
