package day37_Inheritance.phoneTask;

import java.util.concurrent.TransferQueue;

public class Phone { //parent class: only contains the common features

    public String brand;
    public String model;
    public String size;
    public double prize;
    public String color;

    public  static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double prize, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.prize = prize;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting" + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", prize= $" + prize +
                ", color='" + color + '\'' +
                ", has Battery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the sub class' objects
 */
