package day38_Inheritance.ShapeTask;

public class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        double area = 0;
        return area;
    }
    public double perimeter(){
        double perimeter = 0;
        return perimeter;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area is ='" + area() + '\'' +
                "perimeter is ='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
	variable:		name
	Add A constructor to set the filed
	Methods:	area(){return 0}
		perimeter{return 0}
		toString(): name, area, perimeter
Circle	r	pi
	toString(): name, r, pi, area, perimeter

Square	s
	toString(): name, s, area, perimeter

Rectangle	l	w
	toString(): name, l, w, area, perimeter

 */
