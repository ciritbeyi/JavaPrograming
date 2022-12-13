package day31_Constructor;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Ozgur", 'M',45);
        Person person2 = new Person("Ediz", 'M', 14);
        Person person3 = new Person("Serife", 'F', 70);
        person2.age = 15;

        System.out.println(person1); //Person{name='Ozgur', gender=M, age=45}
        System.out.println(person3); // Person{name='Serife', gender=F, age=70}
        System.out.println(person2); // Person{name='Ediz', gender=M, age=15}













    }
}
