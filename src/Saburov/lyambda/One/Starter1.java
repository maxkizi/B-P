package Saburov.lyambda.One;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Starter1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(String.format("%02d", i));
        }
        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list, (s1, s2)-> s1.compareTo(s2));

    }
}
