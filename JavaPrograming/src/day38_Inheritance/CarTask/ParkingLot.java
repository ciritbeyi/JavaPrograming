package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry",2018,6000,"white",125000);

        Tesla tesla = new Tesla("ModelS",2022, 9000,"red", 0);

        BMW bmw = new BMW("X3",2021,12000,"gray",50000);

        toyota.start();
        tesla.start();
        bmw.start();



        }





}
