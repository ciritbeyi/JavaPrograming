package day31_Constructor;

public class Pizza {
//Attributes:  size, numberOfCheeseTopping, numberOfPepperoniTopping
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

//Add a constructor that can set all the fields

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

// calcCost(): returns the totalCost of the pizza
    public double calcCost() {
        double startingPrice = (size == 'S')? 10 :(size == 'M')? 12 : 14;
        double totalPrice = startingPrice + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        return totalPrice;
    }

//toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice= $" + calcCost() +
                '}';
    }




}
/*Pizza Task:
 Attributes:
   size, numberOfCheeseTopping, numberOfPepperoniTopping
Add a constructor that can set all the fields
Actions:
calcCost(): returns the totalCost of the pizza
toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */