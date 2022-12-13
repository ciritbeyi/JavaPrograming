package day37_Inheritance.ScrumTask;

public class Employee extends Person{ // Employee IS A Person

    public String jobTitle;
    public int id;
    public  double salary;
    public String companyName;

    public Employee(String name, int age, char gender,String jobTitle,int id,double salary,String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }


    public void work(){
        System.out.println(name + " is working in :" + companyName+ " with the salary of "+ salary);
    }

    public String toString() {  // we can change the sequence according to  our desire
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ",jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
