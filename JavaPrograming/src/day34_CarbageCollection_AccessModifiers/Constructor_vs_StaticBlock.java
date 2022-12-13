package day34_CarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {   // run ettigimmizde bu  calisacak
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){  // bu Constructor calsmayacak cunku object yok
        System.out.println("Constructor");
    }

    public static void main(String[] args) { // calisacak
        System.out.println("Main method");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }


}
