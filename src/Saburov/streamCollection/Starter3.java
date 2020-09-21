package Saburov.streamCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Starter3 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i =0; i <10; i++){
            personList.add(new Person("Name_" + i, Math.random() + 1));
        }

        List<Double> grades =  personList.stream().map(person -> person.getGrade()).filter(g -> g > 1.5).collect(Collectors.toList()) ;
        System.out.println(grades);

        for (Double d: grades){
            System.out.println(d);
        }
    }
}
