package day30_CustomClass;

public class Employee {

    public String name;
    public  char gender;
    public int age;
    public  int id;
    public  String jopTitle;
    public  double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int id, String jopTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jopTitle = jopTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jopTitle='" + jopTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jopTitle + " " + name + " is working");
    }



}
/*
Attributes: name , id, gender, jopTitle, salary, isFullTime(boolean)
Actions : toString() , setInfo,  work

CapitalOne Class:
1. create 5 Employee objects
2. store those 5 employee objects into an array
3. how many employees are full time employee?
4. What is the min salary?
5. What is the max salary?
 */
