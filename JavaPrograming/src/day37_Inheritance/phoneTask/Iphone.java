package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

//    public Iphone(String brand, String model, String size, double prize, String color) {
//        super(brand, model, size, prize, color);
//    }  // for Iphone brand can be static => we made it static as "Apple"
// when we create the object we will not give the brand it will automatically assign Apple to the brand
    public Iphone(String model, String size, double prize, String color) {
        super("Apple", model, size, prize, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " "+ model + " is having a face Time with " + phoneNumber);

    }

    public void faceTime(String email){
        System.out.println(brand + " "+ model + " is having a face Time with " + email);
    }



}
