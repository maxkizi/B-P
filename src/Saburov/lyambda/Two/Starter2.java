package Saburov.lyambda.Two;

import Saburov.lyambda.One.Starter;

public class Starter2 {
    public static void main(String[] args) {
        Starter2 s = new Starter2();
        Person p = new Person();

        s.processHospital(p,4, (g, d) -> 0.8 * 8 * g);
        s.processAddition(p,8.5, (g,h) -> 2.0* h *g);
    }

    public void processHospital (Person p, Integer days, Process <Double, Integer, Double> ph){
        Double sum = ph.process(p.getGrade(), days);
    }
    public void processAddition (Person p, Double hours, Process<Double, Double, Double> pa){
        Double sum = pa.process(p.getGrade(), hours);
    }
}
