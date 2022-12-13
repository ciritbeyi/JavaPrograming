package day38_Inheritance.ShapeTask;

public class Circle extends Shape{

    public double r;
    public  static double pi = 3.14; // static yazacak miyiz ????

    public Circle(String name, double r) {  // name i sbt hale nail getirecez ??
        super(name);
        this.r = r;
    }

    @Override
    public double area() {
        double result = r * pi;
        return result;
    }

    @Override
    public double perimeter() {
        double result = 2*r*pi;
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", name='" + name + '\'' +
                "r=" + r +
                ", pi=" + pi +
                ", Area of circle ='" + area() + '\'' +
                ", Perimeter of circle ='" + perimeter() + '\'' +
                '}';
    }
}
