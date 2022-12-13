package day38_Inheritance.CarTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    public void start(){
        System.out.println(brand + " " + model + " Twist the key to ignition");
    }
}
/*
	Create the following sub classes of Car:
			1. Toyota:			extra methods:			reliable()
			2. BMW:				extra methods:			breaksDown()						racing()
			3. Tesla:			extra methods:			autoPilot();
 */
