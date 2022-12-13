package day05_Concatenation;

public class Shippingadress {
    public static void main(String[] args) {
        /*
         Variable Type lar ortak oldugu zaman bir tane altinda toplanabilir. Bu durumda aralara , sona ise ; konulur.
        String name = "Ozgur Ciritbeyi",
                buildingNumber = "25A",
                streetName = "Logenstrasse",
                city = "Kaiserslautern",
                state = "Reinland Platz",
                zipcode = "67655Z";
     */
        String name = "Ozgur Ciritbeyi";
        String buildingNumber = "25A";
        String streetName = "Logenstrasse";
        String city = "Kaiserslautern";
        String state = "Reinland Platz";
        String zipcode = "67655Z";

        System.out.println(name);
        System.out.println(streetName + " " + buildingNumber);
        System.out.println(zipcode + " " + city);
        System.out.println("-----------------");
        System.out.println(name + "\n" + streetName + " " + buildingNumber + "\n" + zipcode + " " + city );
// Tek print statement icinde yazip farkli satirlarda yazmak istedigimde \n sequences i " " icinde kullanmaliyiz.
        System.out.println("-----------------");
        String adress = name + "\n" + streetName + " " + buildingNumber + "\n" + zipcode + "" + city;
        System.out.println(adress);
// tum adresi variable olarak tanimlarken tum ifadeyi " " icine almiyoruz. eger alirsak text haline gelmis olur.
    }
}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
    1. name
    2. buildingNumber
    3. streetName
    4. city
    5. state
    6. zipCode
3. Use concatenation to print the full addres
 */