interface InterfaceForPolymorphism1 {
    public String printWorld();

    public int likeArithmetic();
}

interface InterfaceForPolymorphism2 {
    public String printWorld2();

    public int likeArithmetic2();
}

public class Polymorphism implements InterfaceForPolymorphism1, InterfaceForPolymorphism2 {
    public String printWorld() {
        return "Hello, World!";
    }

    public int likeArithmetic() {
        return 2 + 2;
    }

    public String printWorld2() {
        return "Hello, World!";
    }

    public int likeArithmetic2() {
        return 2 + 2;
    }
}
