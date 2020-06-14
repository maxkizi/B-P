import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHash {
    public static void main(String[] args) {
        Hash h1 = new Hash(13L, "Maxim");
        Hash h2 = new Hash(13L, "Maxim");


      /* if (h1.equals(h2))
            System.out.println("Ok");
        else System.out.println("Not equals");



        System.out.println( h1.toString());

        System.out.println( h2.toString());*/

        Set<Hash> s1 = new HashSet<>() ;
        System.out.println("1");
        s1.add(h1);
        System.out.println("2");
        s1.add(h2);

        System.out.println("Size of set = " + s1.size());


    }
}
