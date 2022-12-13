package day37_Inheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String size, double prize, String color) {
        super("Samsung", model, size, prize, color);
    }

    public void  freeze(){
        System.out.println(brand + " " + model + " is freezing");
    }








}
