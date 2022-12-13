package day37_Inheritance.AnimalTask;

public class Parrot extends Animal{

    public String parrotWingColor;

    public Parrot(String name, String bread, char gender, int age, String size, String color,String parrotWingColor ) {
        super(name, bread, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name + " is  singing");
    }





}
