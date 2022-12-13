package day35_Encapsulation.encapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(-1);

       // circle1.setRadius(2.5);

        System.out.println(circle1.calcArea(circle1.getRadius()));
        System.out.println(circle1.calcPerimeter(circle1.getRadius()));






    }
}
