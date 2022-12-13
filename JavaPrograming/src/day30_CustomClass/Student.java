package day30_CustomClass;

public class Student {
// this are instance variable
    public String name;
    public  char gender;
    public  int age;
    public int ID;
    public  char grade;

    public void setInfo(String name, char gender, int age, int ID, char grade) { // these are local variable
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
        // this. keyword : used for calling the instance variable (we use it only when instance variable == local variable)
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void  code(){
        System.out.println(name + " is coding");
    }

    public  void  sleep(){
        System.out.println(name + " is sleeping");
    }




}
