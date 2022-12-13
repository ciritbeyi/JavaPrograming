package day32_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, char gender) {
        this(name);   //this.name = name;  // burasi ilk constructor un tekrari
        // cagirmak icin this() keyword unu kullanmamiz gerek
        // Employee(name)  // regular method da oldugu gibi className uzerinden cagiramiyoruz
        this.gender = gender;
    }
    public Employee(String name, char gender, String jobTitle){
       // this.name = name; // this is part of second constructor
      //  this.gender = gender;  // this is part of second constructor
        this(name,gender);  // we call the second constructor
        this.jobTitle = jobTitle;
    }
    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }




    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



    /*
    in regular method => we can use one method in another method
        public static void method1() {
        System.out.println("Method 1");
    }
    public static void  method2(){
        method1();
        System.out.println("we can add method1() here by calling it with its name ");
    }

    public static void  method3(){
        method1();
        method2();
        System.out.println("we can call more than one  method() here");
    }
     */


}
