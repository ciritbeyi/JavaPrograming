package day37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "SM", id, salary, companyName);
    }

    // jobTitle is a common instance variable so we make it fixed for all SM's

    public void arrangeMeeting(){
        System.out.println(name + " is arranging the meetings");
    }



}
