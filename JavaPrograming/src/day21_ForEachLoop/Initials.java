package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] name = {"Ozgur Ciritbeyi", "Ali Ciritbeyi" , "Okan Kenan", "Muzeyyen Gok","Hatice Yasar",
                "Ediz Caglar","Ali Furkan",};

            for (String each  : name) {
                String initials = each.charAt(0) + "." +each.charAt(each.indexOf(" ")+1);
                System.out.println(initials);
            }



    }
}
