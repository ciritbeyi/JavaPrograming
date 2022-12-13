package day32_Constructors;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car("Toyata");
        Car car2 = new Car("Honda" ,"Accord");
        Car car3 = new Car("Lexus" ,"RX350",2021);
        Car car4 = new Car("BMW" ,"X6",2020, 50000);
        Car car5 = new Car("Tesle" ,"Model3",2019, 70000,"White");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

//        Car{brand='Toyata', model='null', year=0, price=0.0, color='null'}
//        Car{brand='Honda', model='Accord', year=0, price=0.0, color='null'}
//        Car{brand='Lexus', model='RX350', year=2021, price=0.0, color='null'}
//        Car{brand='BMW', model='X6', year=2020, price=50000.0, color='null'}
//        Car{brand='Tesle', model='Model3', year=2019, price=70000.0, color='White'}




    }
}
