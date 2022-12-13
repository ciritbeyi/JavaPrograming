package day33_Statics;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        Employee employee2 = new Employee();
        employee2.name = "Eda";
        Employee employee3 = new Employee();
        employee3.name = "Neda";

/*   public static String name;  custom class da boyle yazarsak => en sonuncusu gecerli olur.
        System.out.println(employee1.name);  // Neda
        System.out.println(employee2.name);  // Neda
        System.out.println(employee3.name);  // Neda
*/
//   public String name;  custom class da boyle yazarsak => hepsini ayri ayri yazar.
        System.out.println(employee1.name);  // Ahmet
        System.out.println(employee2.name);  // Eda
        System.out.println(employee3.name);  // Neda




    }
}
