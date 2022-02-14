package pl.leszczynskipawel.zad2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class zad2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ala");
        strings.add("kot");
        strings.add("pies");
        strings.add("dom");

        Set<String> set= Set.of(strings.get(0),strings.get(1),strings.get(2),strings.get(3));
        HashSet<String> hashSet= new HashSet<String>(strings);

        wypiszCoDrugi(strings);
        wypiszCoDrugi(set);
        wypiszCoDrugi(hashSet);
    }
    public static <E extends Iterable> void wypiszCoDrugi(E e){
        Iterator iterator =e.iterator();
        Object wsk;
        int counter=1;
        ArrayList<Object> list = new ArrayList<>();
        while (iterator.hasNext()){
            wsk=iterator.next();
            counter++;
            if(counter%2==0){
                list.add(wsk);
            }
        }
        list.forEach(x-> System.out.println(x+";"));
    }
}

