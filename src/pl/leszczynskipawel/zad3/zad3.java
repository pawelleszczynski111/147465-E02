package pl.leszczynskipawel.zad3;

import java.io.File;

public class zad3 {
    public static void main(String[] args) {
        String path = "src/pl/pawelleszczynski/zad3";
        String[] directories = podKatalogi(path);
//        for (String s : directories) {
//            System.out.println(s);
//        }
    }
    public static String[] podKatalogi (String path){
        File file = new File(path);
        return file.list((dir, name) -> file.isDirectory());
    }
}
