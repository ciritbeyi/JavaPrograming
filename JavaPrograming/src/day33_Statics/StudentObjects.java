package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Neset", 'M');
        Student student3 = new Student("Sultan", 1);
        Student student4 = new Student("Eda", 12,'B');
        Student student5 = new Student("Neda", 'F',12);
        Student student6 = new Student("Emir", 'M',12,37);
        Student student7 = new Student("Ediz",'M',14,99,'C');

        System.out.println(student1 == student2); // false

        Student[] students = {student1,student2,student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));





    }
}
