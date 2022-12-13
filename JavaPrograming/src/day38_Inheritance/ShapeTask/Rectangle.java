package day38_Inheritance.ShapeTask;

public class Rectangle extends Shape{

    public double l,w;

    public Rectangle(String name,double l,double w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    public double area(){
        double result = w * l;
        return result;
    }

    public double perimeter(){
        double result = 2 * (w + l);
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                ", name='" + name + '\'' +
                "l=" + l +
                ", w=" + w +
                ", Area of Square='" + area() + '\'' +
                ", Perimeter of Square='" + perimeter() + '\'' +
                '}';
    }
}
