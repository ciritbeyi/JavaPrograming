package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        emp1.setInfo("Ozgur", 'M', 45, 2545, "SDET", 60000, true );
        emp2.setInfo("Kursat", 'M', 35, 2211, "Developer", 99000, true );
        emp3.setInfo("Melike", 'F', 40, 3322, "SDET", 70000, false );
        emp4.setInfo("Ferhat", 'M', 36, 5566, "Manager", 85000, true );
        emp5.setInfo("Akile", 'F', 26, 1155, "Senior SDET", 55000, false );

        Employee[] employees = {emp1,emp2, emp3, emp4,emp5};

        int countFullTime = 0;
        int countPartTime = 0;
        double maxSalary = employees[0].salary;
        double minSallary = employees[0].salary;

        for (Employee eachEmp : employees) {
            if (eachEmp.isFullTime){
                countFullTime++;
            } else{
                countPartTime++;
            }
            if (eachEmp.salary > maxSalary){
                maxSalary = eachEmp.salary;
            }
            if (eachEmp.salary < minSallary){
                minSallary = eachEmp.salary;
            }

        }
        System.out.println("countPartTime = " + countPartTime); // countPartTime = 2
        System.out.println("countFullTime = " + countFullTime); // countFullTime = 3
        System.out.println("minSallary = " + minSallary); // minSallary = 55000.0
        System.out.println("maxSalary = " + maxSalary); // maxSalary = 99000.0













    }
}
