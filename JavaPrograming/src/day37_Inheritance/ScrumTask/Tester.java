package day37_Inheritance.ScrumTask;

public class Tester extends Employee{// Tester IS A Employee + Tester IS A Person  (Employee IS A Person)
    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }



    public void creteTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }

// Employee class daki toString() tum variable lari icerdigi icin burada ayrica bir toString yapmadik.
// Eger Tester class a ozel bir variable olsa idi toString olusturacak idik

}
