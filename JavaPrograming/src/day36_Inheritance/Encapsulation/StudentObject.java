package day36_Inheritance.Encapsulation;

import javax.swing.plaf.basic.BasicArrowButton;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Ediz", 14, 'M', 'B',"MIT");

        System.out.println("student1 = " + student1); // Student{name='Ediz', age=14, gender=M, grade=B}

        Student student2 = new Student("Ediz", 4, 'Q', 'Z',"MIT");
        student2.setName("Zehra");
        student2.setSchoolName("Basari");

        System.out.println("student2 = " + student2);// student2 = Student{name='Ediz', age=0, gender= , grade= }






    }
}
