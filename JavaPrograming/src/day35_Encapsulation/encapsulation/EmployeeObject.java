package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("", '&', 10, -2000);

        System.out.println(employee1);// Employee{name='null', gender= , age=0, salary=0.0}

        Employee employee2 = new Employee("Ediz", 'M', 18, 60000);

        System.out.println(employee2); // Employee{name='Ediz', gender=M, age=18, salary=60000.0}

        employee2.setAge(45);
        employee2.setName("Ozgur");

        System.out.println(employee2); // Employee{name='Ozgur', gender=M, age=45, salary=60000.0}

        Employee employee3 = new Employee("Zeynep", 'F', 18, 90000);

        employee3.setSalary(employee3.getSalary() + 15000);

        System.out.println(employee3); // Employee{name='Zeynep', gender=F, age=18, salary=105000.0}







    }
}
