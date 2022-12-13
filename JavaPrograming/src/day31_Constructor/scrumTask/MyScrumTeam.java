package day31_Constructor.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

//1. create an array of Testers and add the testers from your group
// 4 tester objects
        Tester tester1 = new Tester("Ozgur", "SDET", 2101, 85000);
        Tester tester2 = new Tester("Melike", "QA", 2102,95000);
        Tester tester3 = new Tester("Ferhat", "Senior QA", 2103,99000);
        Tester tester4 = new Tester("Akile", "SDET",2104,88000);

        Tester[] testers = {tester2, tester3, tester4};

//2. create an array of developers add the developers from your group
// 4 developer objects

        Developer developer1 = new Developer("Kursat", "Java Dev",2106,110000);
        Developer developer2 = new Developer("Ediz", "Java Master", 2107, 112000);
        Developer developer3 = new Developer("Kenan", "Software Developer", 2108, 113000);
        Developer developer4 = new Developer("Okan","Senior Developer", 2109,124000);

        Developer[] developers = { developer2, developer3, developer4};

//3. create an object of ScrumTeam and store the testers & developers above to the scrum team
// 1 ScrumTeam object

        ScrumTeam scrum = new ScrumTeam("Ahmet", "Neset", "Mustafa", 14 );
        scrum.addTester(tester1);

        scrum.addTesters(testers);

        System.out.println(scrum);
        // ScrumTeam{PO='Ahmet', BA='Neset', SA='Mustafa', total number of testers=0, total developers=0, daysOfSprint=14}

        scrum.addDeveloper(developer1);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        //ScrumTeam{PO='Ahmet', BA='Neset', SA='Mustafa', total number of testers=4, total developers=4, daysOfSprint=14}
        System.out.println("---------------------------------------------------------------------");

        for (Tester eachTester : scrum.testerList ){
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("---------------------------------------------------------------------");

        for (Developer eachDeveloper :scrum.devopsList ){
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("---------------------------------------------------------------------");

        scrum.removeTester(2104);
        scrum.removeDeveloper(2109);

        System.out.println(scrum);
        //ScrumTeam{PO='Ahmet', BA='Neset', SA='Mustafa', total number of testers=3, total developers=3, daysOfSprint=14}






    }
}
/*
create a class called MyScrumTeam:
1. create an array of Testers and add the testers from your group
2. create an array of developers add the developers from your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
