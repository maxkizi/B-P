package Composition.nonstatic;

public class TestNonStatic {
    public static void main(String[] args) {

        Human obj = new Boy();
        Boy obj1 = new Boy();

        obj.walk();
        obj1.walk();
    }
}
