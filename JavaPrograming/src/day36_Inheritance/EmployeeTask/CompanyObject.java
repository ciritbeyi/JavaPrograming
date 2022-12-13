package day36_Inheritance.EmployeeTask;

public class CompanyObject {
    public static void main(String[] args) {

        Tester tester1 = new Tester();

        tester1.setInfo("Ozgur","SDET","CDEO", 'M',45, 2101, 60000);
        tester1.test();

        Developer developer = new Developer();
        developer.setInfo("Kursat", "Dev-Eng", "Acer", 'M', 33, 2014, 100000);
        developer.code();

        Driver driver1 = new Driver();
        driver1.setInfo("Ali", "Truck Driver", "Karatas", 'M', 44, 1978, 55000);
        driver1.drive();

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Serife", "Primary School Teacher", "Halk Egitim",'F', 56, 15,45000);
        teacher1.teach();



    }
}
