package equalsHashCodeSaburov;

import java.util.HashSet;
import java.util.Set;

public class Starer {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(1L, "name");
        MyClass m2 = new MyClass(1L, "name");
        MyClass m3 = new MyClass(1L, "name");
        System.out.println(m1.equals(m2));


        /*Set<MyClass> set = new HashSet<>();
        System.out.println("1");
        set.add(m1);
        System.out.println("2");
        set.add(m2);
        System.out.println("3");
        set.add(m3);

        System.out.println("SIZE: " + set.size());*/



    }
}
