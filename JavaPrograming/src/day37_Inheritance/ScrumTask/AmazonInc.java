package day37_Inheritance.ScrumTask;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc"; // tum Amamzon calisanlari icin ayni oldugu icin bir variable tannimladik
        ProductOwner po = new ProductOwner("Tahir", 45,'M',6,160000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Sultan",40, 'F',3,150000,company );

        ScrumMaster sm = new ScrumMaster("Tulay", 46,'F',34,14000,company);

        Tester tester1 = new Tester("Ozgur", 45,'M', "QA",101,80000,company);
        Tester tester2 = new Tester("Melike", 40,'F', "SDET",102,85000,company);
        Tester tester3 = new Tester("Ferhat", 35,'M', "QA",103,90000,company);
        Tester tester4 = new Tester("Akile", 33,'F', "SDET",104,82000,company);
        Tester tester5 = new Tester("Muhammet", 29,'M', "QA",105,70000,company);

        Tester[] testers = {tester1, tester2, tester3, tester4, tester5};

        Developer developer1 = new Developer("Kursat",35,'M',"Dev Eng",202,150000,company);
        Developer developer2 = new Developer("Emre",34,'M',"Dev",203,150000,company);
        Developer developer3 = new Developer("Ahmet",45,'M',"Dev Eng",204,150000,company);
        Developer developer4 = new Developer("Neda",42,'F',"Dev",205,150000,company);
        Developer developer5 = new Developer("Cemil",46,'M',"Dev Eng",206,150000,company);

        Developer [] developers = { developer2, developer3, developer4,developer5};


        ScrumTeam scrumTeam = new ScrumTeam(po, ba,sm);
        System.out.println(scrumTeam);//ScrumTeam{PO=Tahir, BA=Sultan, SM=Tulay, number of testers=0, number of developers=0}

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);// ScrumTeam{PO=Tahir, BA=Sultan, SM=Tulay, number of testers=5, number of developers=5}

        scrumTeam.removeDeveloper(203);
        scrumTeam.removeTester(105);
        System.out.println(scrumTeam);// ScrumTeam{PO=Tahir, BA=Sultan, SM=Tulay, number of testers=4, number of developers=4}

        System.out.println("---------------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }
        System.out.println("---------------------------------------------------------");
        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }







    }
}
