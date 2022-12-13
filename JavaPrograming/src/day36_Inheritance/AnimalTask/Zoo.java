package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("max", "Husky", 'M', 2, "Small", "white");
        dog.eat();
        dog.bark();
        dog.drink();
        dog.move();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Zeytin", "british", 'F',4, "big", "black");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);


    }
}
