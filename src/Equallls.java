public class Equallls {
    String name;
    int age;

    Equallls(String name, int age){
        this.age = age;
        this.name = name;
    }

    public boolean sravn (Equallls obj){
        if (this ==  obj)
            return true;
        else return false;
    }

    public boolean sravnFields (Equallls obj){
        if (this.name == obj.name && this.age == obj.age)
            return true;
        else return false;
    }




    public static void main(String[] args) {
        Equallls obj1 = new Equallls("Max", 20);
        Equallls obj2 = new Equallls("Max", 20);

        String s1 = "Max";
        String s2 = "Max";

        String s11 = new String("Max");
        String s22 = new String("Max");

        System.out.println("1. Сравнение объектов строк");
        System.out.println("Строка s11 " + s11 + " и строка s22 " + s22 + ": " +  s11.equals(s22));
        System.out.println("Хэш код s11 = " + s11.hashCode() + ", Хэш код s22 = " + s22.hashCode());
        System.out.println();

        System.out.println("2. Сравнение строк");
        System.out.println("Строка s1 " + s1 + " и строка s22 " + s2 + ": " +  s11.equals(s22));
        System.out.println("Хэш код s1 = " + s1.hashCode() + ", Хэш код s22 = " + s2.hashCode());
        System.out.println();

        System.out.println("Method equals:");
        System.out.println(obj1.equals(obj2));

        System.out.println("Method sravn: ");
        System.out.println(obj1.sravn(obj2));

        System.out.println("Method sravnFields: ");
        System.out.println(obj1.sravnFields(obj2));

    }
}
