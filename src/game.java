public class game {
    public static  void main (String args [])
    throws java.io.IOException{
        char answer = 'c', ignore, ch;

        do {
            System.out.println("угадайте букву");
            ch = (char) System.in.read();
                do{
                    ignore = (char) System.in.read();
                }while (ignore != '\n');
                if (ch < answer)
                    System.out.println("Ответ ближе к концу алфавита");
                else if (ch > answer)
                    System.out.println("Ответ ближе к началу алфавита");
        }while (answer != ch);

            System.out.println("Правильно!");

    }
}
