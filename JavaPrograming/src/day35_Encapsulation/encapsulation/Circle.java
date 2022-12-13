package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    private static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <=0){
            System.err.println("Invalid radius");
            return;
        }
        this.radius = radius;
    }

//    public  double getPi() {
//        return pi;
//    }
//
//    public  void setPi(double pi) {
//        if (pi != 3.4){
//            return;
//        }
//        Circle.pi = pi;  // not an instance variable => we can not use this keyword / a static variable => we called through class name
//    }

    public double calcArea(double radius){
        double result = pi * getRadius() * getRadius();
        return result;
    }

    public double calcPerimeter(double radius){
        double result = 2 * pi * getRadius();
        return result;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea(radius) +
                "perimeter=" + calcPerimeter(radius) +
                '}';
    }
}
/*
2. Create a class named Circle
			privtae variables: 				radius
			public variable: 				pi

		 	Encapsulate all the private fields
		 			1. radius of the circle can not be zero or negative
 			Add a constructor that can set the raidus of coircle when circle object is created
 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */
