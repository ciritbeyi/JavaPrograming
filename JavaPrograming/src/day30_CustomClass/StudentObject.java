package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

       Student student1 = new Student();
       student1.setInfo("aygun", 'F', 39, 2210,'A' );
        System.out.println(student1);//Student{name='aygun', gender=F, age=39, ID=2210, grade=A}

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 22123,'B' );

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 42, 2150,'C' );

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 28, 5511,'A' );

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 45, 2525,'C' );
        
        Student [] students = {student1, student2, student3, student4, student5};

        for (Student eachStudent : students) { // to print the students []
            System.out.println(eachStudent);
        }
        System.out.println("---------------------------------------------");
        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade:A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student eachStudent : students) {
            if (eachStudent.grade == 'A'){
                earlyBirds.add(eachStudent);
            } else {
                angryBirds.add(eachStudent);
            }
        }
        System.out.println(earlyBirds);
        //[Student{name='aygun', gender=F, age=39, ID=2210, grade=A}, Student{name='Ali', gender=M, age=28, ID=5511, grade=A}]
        System.out.println(angryBirds);
        //[Student{name='Hulya', gender=F, age=26, ID=22123, grade=B}, Student{name='Elminur', gender=F, age=42, ID=2150, grade=C},
        // Student{name='Mert', gender=M, age=45, ID=2525, grade=C}]
        
        
        
        


    }
}
