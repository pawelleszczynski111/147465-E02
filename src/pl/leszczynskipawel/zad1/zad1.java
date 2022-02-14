package pl.leszczynskipawel.zad1;

import java.time.LocalTime;
import java.util.ArrayList;

public class zad1 {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(12, 20);
        LocalTime t2 = LocalTime.of(13, 40);
        LocalTime t3 = LocalTime.of(15, 35);
        LocalTime t4 = LocalTime.of(17, 33);

        ArrayList<LocalTime> locdat = new ArrayList<>();
        locdat.add(t1);
        locdat.add(t2);
        locdat.add(t3);
        locdat.add(t4);

        int a = 1;
        int b = 2;
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(a);
        ints.add(b);
        ints.add(a);

        jestPalindromem(locdat);
        jestPalindromem(ints);

    }

    public static <T extends Comparable> void jestPalindromem(ArrayList<T> list) {
        ArrayList<T> list1 = list;
        ArrayList<T> list2 = new ArrayList<>();
        int check=0;
        for (int i=0;i<list.size();i++){
            list2.add(list1.get(list1.size()-i-1));
        }
        for (int i=0;i<list1.size();i++){
            if(list1.get(i).compareTo(list2.get(i))!=0){
                check++;
                System.out.println("lista nie jest palindromem");
                break;
            }
        }
        if (check==0){
            System.out.println("lista jest palindromem");
        }
    }
}

