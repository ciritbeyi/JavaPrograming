package day31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SA;
    public ArrayList<Tester> testerList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

//Add A constructor that can set the fileds PO, BA, and SM
    public ScrumTeam(String PO, String BA, String SA,  int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SA = SA;
        this.daysOfSprint = daysOfSprint;
    }
//addTester(Tester tester): adds the given tester to the testers ArrayList
    public void addTester(Tester tester){
        testerList.add(tester);
    }

//addTesters(Tester[] testers): adds the given testers to the testers ArrayList
    public  void  addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

//addDeveloper(Developer developer): adds the given developer to the developers ArrayList
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

//addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

//removeTester(long employeeID): removes the given tester from the testers ArrayList
    public void removeTester(long employeeID){
        testerList.removeIf(p-> p.employeeID == employeeID);
    }

//removeDeveloper(long employeeID): removes the developer from the developers ArrayList
    public void removeDeveloper(long employeeID){
        devopsList.removeIf(p-> p.employeeID == employeeID );
    }

//toString(): prints number of tester,& developers,  PO name, SM name, BA name

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SA='" + SA + '\'' +
                ", total number of testers=" + testerList.size() +
                ", total developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/* Scrum Task
create a class called ScrumTeam
Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = new ArrayList<>();
                ArrayList<Developer> devopsList = new ArrayList<>();
                int daysOfSprint;

Add A constructor that can set the fileds PO, BA, and SM

Actions:
addTester(Tester tester): adds the given tester to the testers ArrayList
addTesters(Tester[] testers): adds the given testers to the testers ArrayList

addDeveloper(Developer developer): adds the given developer to the developers ArrayList
addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

removeTester(long employeeID): removes the given tester from the testers ArrayList
removeDeveloper(long employeeID): removes the developer from the developers ArrayList

toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */