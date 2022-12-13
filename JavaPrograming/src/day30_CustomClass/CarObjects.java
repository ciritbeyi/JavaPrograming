package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("BMW", "X5","White", 2021, 35000);

        Car car2 = new Car();
        car2.setInfo("Toyota", "Corsa", "Red", 2018, 24000);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Gray", 2015, 21000);

        System.out.println(car1); // Car{brand='BMW', model='X5', color='White', year=2021, price= $35000.0}
        System.out.println(car2); // Car{brand='Toyota', model='Corsa', color='Red', year=2018, price= $24000.0}
        System.out.println(car3); //

// creating an array of car objects
        Car [] cars = {car1, car2, car3};  //
// creating an ArrayList of car objects
        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
// to print each car's name and price
        for (Car each : carList) {
            System.out.println(each.brand + " : " + each.price);
        }
        System.out.println("---------------------------------------------------------");

// eligible for Recall => BMW : 2020 # 2022    and    Toyota  2017  2019

        carList.removeIf(p-> p.brand.equals("BMW") && p.year >=2020 && p.year<=2022);
        carList.removeIf(p-> p.brand.equals("Toyota") && p.year>=2017 &&p.year<=2019);

        System.out.println(carList);//[Car{brand='Audi', model='Q7', color='Gray', year=2015, price= $21000.0}]






    }
}
