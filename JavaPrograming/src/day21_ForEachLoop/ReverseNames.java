package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] name = {"Ozgur Ciritbeyi", "Ali Ciritbeyi" , "Okan Kenan", "Muzeyyen Gok","Hatice Yasar",
                "Ediz Caglar","Ali Furkan",};

        for (String each : name ){  // Outer loop to get each element of array name
            String reverse = "";
 // NOT: Tersten yazdirma islemi sondan baslayacagi icin for each loop kullanamayiz
            for (int i = each.length()-1; i >= 0 ; i--) { // Inner loop to reverse each
                reverse+= each.charAt(i);
            } // Inner loop closing
            System.out.println(reverse);
        }  // Outer loop closing

   }

}
