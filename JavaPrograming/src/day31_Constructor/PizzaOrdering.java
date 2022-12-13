package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

 // create 100 pizza objects: size = 'S' , cheese topping-2, pepperoni topping -3
 // create 100 pizza objects: size = 'M' , cheese topping-3, pepperoni topping -4
 // create 100 pizza objects: size = 'L' , cheese topping-4, pepperoni topping -5


        // we create 300 small,medium,largePizza  then add them to an ArrayList
        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S', 2,3);
            Pizza mediumPizza = new Pizza('M', 3,4);
            Pizza largePizza = new Pizza('S', 4,5);

            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza)); //Total number of pizza: 300
        }

        System.out.println("Total number of pizza: " + pizzas.size());

// to calculate 300 pizzas total price : we will use calcCost() that we created before
        double totalPrice = 0;
        for (Pizza eachPizza : pizzas) { // to accesses the each pizza order in pizzas Arraylist
            totalPrice+=eachPizza.calcCost();
        }

        System.out.println("totalPrice = " + totalPrice); //  totalPrice = 7400.0






    }
}
