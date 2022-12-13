package day32_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ozgur");
        Employee employee2 = new Employee("Okan",'M');
        Employee employee3 = new Employee("Ali", 'M',"SDET");
        Employee employee4 = new Employee("Zeliha",'F',"QA",11000);

        System.out.println(employee1); //Employee{name='Ozgur', gender= , jobTitle='null', salary=0.0}

        System.out.println(employee2); // Employee{name='Okan', gender=M, jobTitle='null', salary=0.0}

        System.out.println(employee3); //Employee{name='Ali', gender=M, jobTitle='SDET', salary=0.0}

        System.out.println(employee4); //Employee{name='Zeliha', gender=F, jobTitle='QA', salary=11000.0}






    }
}
