package Saburov.lyambda.One;

import java.io.File;

public class Starter {
    public static void main(String[] args) {

        File src = new File(".");
        File[] files = src.listFiles(pathname -> pathname.isDirectory());

        for (File file: files){
            System.out.println(file.getName());
        }
    }
}
