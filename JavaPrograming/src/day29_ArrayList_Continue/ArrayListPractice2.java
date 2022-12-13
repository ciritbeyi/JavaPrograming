package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David","Ahmed", "Jimmy","Daniel", "Aaron","Ahmed", "David","Shay"));

        employees.retainAll(Arrays.asList("David","Ahmed"));

        System.out.println("employees = " + employees); // employees = [David, Ahmed, Ahmed, David]
        System.out.println("------------------------------");

        String[] names = {"Mary", "Monica","Mehray", "Musti","Sumeyra", "Hasan","Beril"};
//        ArrayList<String> nameList = new ArrayList<>();
//        nameList.addAll(Arrays.asList(names));  // we can also say like this it is same
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println("nameList = " + nameList); //nameList = [Mary, Monica, Mehray, Musti, Sumeyra, Hasan, Beril]

        nameList.removeIf(p-> p.startsWith("M"));
        System.out.println("nameList = " + nameList);// nameList = [Sumeyra, Hasan, Beril]

        // to convert nameList back to String [] names
        names = nameList.toArray(new String[0]);
        System.out.println(Arrays.toString(names)); // [Sumeyra, Hasan, Beril]















    }
}
