package day37_Inheritance.ScrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "PO", id, salary, companyName);
    }


// String jobTitle   is common for all BusinessAnalyst

    public void gather(){
        System.out.println(name + " is gathering requirement");
    }
}
