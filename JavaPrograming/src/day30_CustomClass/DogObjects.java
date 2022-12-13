package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    // here we will use Dog custom class ==> so we need main method
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";
// hashcode => if we don't have toString() in custom class we will get hashcode when we print the object
        System.out.println(dog1); // Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}

        Dog dog2 = new Dog();
        System.out.println(dog2);// Dog{name='null', breed='null', age=0, gender= , size='null', color='null'}
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 4;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "Black";
        System.out.println(dog2);//Dog{name='ACE', breed='Husky', age=4, gender=M, size='Large', color='Black'}
// after generating setInfo() => we can easily assign the Data's
        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "GermanShepard",2, 'M', "Large", "Braun" );
        System.out.println(dog3); //Dog{name='Jack', breed='GermanShepard', age=2, gender=M, size='Large', color='Braun'}

        dog1.eat(); //Lucy is eating
        dog2.bark(); // ACE is barking

        Dog dog4 = new Dog();
        dog4.setInfo("Gofret", "Golden", 2, 'F', "Medium", "Yellow" );

        Dog dog5 = new Dog();
        dog5.setInfo("Karabas","Kangal",4,'M', "Large", "Brown" );



        Dog []dogs = {dog1, dog2,dog3,dog4,dog5};

        ArrayList<Dog> dogList  = new ArrayList<>();
        dogList.addAll(Arrays.asList(dogs));
       // System.out.println(dogList);

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();


    }


}
