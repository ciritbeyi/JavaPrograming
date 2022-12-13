package day38_Inheritance.ShapeTask;

public class Square extends Shape{

    public double s;

    public Square(String name,double s) {
        super(name);
        this.s = s;
    }

    public double area(){
        double result = s * s;
        return result;
    }

    public  double perimeter(){
        double result = 4 * s;
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                ", name='" + name + '\'' +
                "s=" + s +
                ", Area of Square='" + area() + '\'' +
                ", Perimeter of Square='" + perimeter() + '\'' +
                '}';
    }
}
