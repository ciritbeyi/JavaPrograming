package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.name = "ozgur"; // we can not call through the object bcs it is private
        // p1.age = 45;

        p1.setName("Ozgur");
        p1.setAge(45);

       // System.out.println(p1.name + " : " + p1.age); // // we can not call through the object bcs it is private

        System.out.println(p1.getName() + " :" + p1.getAge());  // Ozgur :45


    }




}
