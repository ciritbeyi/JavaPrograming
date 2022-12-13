package day37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "BA", id, salary, companyName);
    }

 // String jobTitle   is common for all BusinessAnalyst

    public void analyst(){
        System.out.println(name + " is analyzing the documents");
    }



}
