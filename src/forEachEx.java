public class forEachEx {
    public static void main (String args[]){
        String girlfriends [] = new String[20];

        girlfriends [0] = "masha";
        girlfriends [1] = "dasha";
        girlfriends [2] = "sasha";
        girlfriends [19] = "anna";

        for (String girl: girlfriends){
            if (girl == null)
                continue;
            System.out.println("Я тебя люблю " + girl);
        }
    }
}
