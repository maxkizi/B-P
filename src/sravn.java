public class sravn {
    public static void main(String[] args) {
        int num [] = {10, 5, -7, 78, 0 , 46, 78, 23, 21, 1};
        int max , min;
        max = min = num[0];

        for (int i = 0; i < 10; i ++ ){
            if (num [i] < min)
                min = num [i];
            if (num [i] > max)
                max = num[i];
        }
        System.out.println("max = " +  max);
        System.out.println("min = " + min);
    }
}
