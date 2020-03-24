public class forEx {
    public static void main (String args []){
        String girlfriends [] = new String[20];

        girlfriends [0] = "masha";
        girlfriends [1] = "dasha";
        girlfriends [2] = "sasha";
        girlfriends [19] = "anna";

        for ( int i = 0; i < 20; i++){
            if (girlfriends [i] == null)
                continue;
                System.out.println("Я тебя люблю " + girlfriends [i]);
        }
    }
}
