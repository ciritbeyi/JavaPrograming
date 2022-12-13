package day37_Inheritance.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", "Husky",'M',2,"Small","Gray");
        System.out.println("dog1 = " + dog1);

        Cat cat1 = new Cat("Zeytin","Van",'F',3,"Medium","White");
        System.out.println("cat1 = " + cat1);

        Parrot parrot1 = new Parrot("geveze", "African",'M',5,"Big","Red","Green");
        System.out.println("parrot1 = " + parrot1);
        //parrot1 = Animal{name='geveze', bread='African', gender=M, age=5, size='Big', color='Red'}
        // parrotWingColor "Green" i yazmadi => bcs Animal parent class daki toString() de bu yok,
        parrot1.sing(); //geveze is  singing




    }




}
