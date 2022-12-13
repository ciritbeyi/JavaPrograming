package day30_CustomClass;

public class Dog {
  // it will be a custom class=> in custom classes we don’t need main method
  // custom classes are not used for running. They are used only for creating objects

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    // if a Method is instance (without static) it means this Method will be executed for ONLY one object
    public void eat() {  // if we type static between public and void the method will be executed for all objects
        System.out.println(name + " is eating");
    }
    public  void bark (){
        System.out.println(name + " is barking");
    }
/*
public String toString() {
        return "Name: " + name;
    }
 */
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

/* Attributes: instance variable
  name, age, gender, breed, size, color


Actions:
   eat(), Play(), bark() .....





 */
