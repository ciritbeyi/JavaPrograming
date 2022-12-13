package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone 12", "6.7 inches", 1000,"Black");

        Samsung samsung1 = new Samsung("Galaxy S19", "6 inches", 900, "White");

        Nokia nokia1 = new Nokia("Brick", "4 inches", 50,"Gray");


        System.out.println("iphone1 = " + iphone1);
        System.out.println("samsung1 = " + samsung1);
        System.out.println("nokia1 = " + nokia1);

//  iphone1 = Phone{brand='Apple', model='Iphone 12', size='6.7 inches', prize= $1000.0, color='Black', has Battery='true'}
//  samsung1 = Phone{brand='Samsung', model='Galaxy S19', size='6 inches', prize= $900.0, color='White', has Battery='true'}
//  nokia1 = Phone{brand='Nokia', model='Brick', size='4 inches', prize= $50.0, color='Gray', has Battery='true'}

        iphone1.call(911);
        iphone1.text(123456789);
        iphone1.faceTime(987456321);
        iphone1.faceTime("hblf@gmail");
        System.out.println("----------------------------------------");

        samsung1.call(911);
        samsung1.text(123456789);
        samsung1.freeze();
        System.out.println("----------------------------------------------");
        nokia1.call(123456789);
        nokia1.text(256987456);
        nokia1.selfDefence();
        System.out.println("----------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);







    }
}
