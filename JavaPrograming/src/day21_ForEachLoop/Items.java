package day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {

        String[] items = {"Schoes", "Jacket", "Gloves", "Airpods", "Ipad", "iPhone 12 case"};
        double[] prieces = {99.99,150.0,9.99,250.0,439.50,39.99};
        int[] itemsIDs = {12345,12346,12347,12348,12349,12340};
// NOTE: burada for each loop kullanamayiz. cunku for each loop sadece bir array icin gecerli
        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prieces[i];
            int id = itemsIDs[i];

            System.out.println(item + " - " + id + " - $" + price);
        }
    }
}
