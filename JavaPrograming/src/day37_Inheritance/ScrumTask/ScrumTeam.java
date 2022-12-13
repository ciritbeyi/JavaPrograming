package day37_Inheritance.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();


    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
        // line 12 deki variable name testers, line 26 daki ile ayni oldugu icin burada this. kullanmamiz gerekiyor.
    }

    public void removeTester(int id){
        testers.removeIf(p-> p.id == id);
    }


    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
        // line 13 deki variable name developers, line 40 daki ile ayni oldugu icin burada this. kullanmamiz gerekiyor.
    }

    public void removeDeveloper(int id){
        developers.removeIf(p-> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", numbers of testers=" + testers.size() +
                ", numbers of developers=" + developers.size() +
                '}';
    }
}
