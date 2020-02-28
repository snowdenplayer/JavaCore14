package ua.lviv.lgs.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> s = new HashSet<>();
        s.add(new Person("Alek",18));
        s.add(new Person("Alek",18));
        s.add(new Person("Karol",36));
        s.add(new Person("Devid",24));
        s.add(new Person("Ola",43));
        for (Person person : s) {
            System.out.println(person);
        }



        System.out.println();
        TreeSet<Person> tsall = new TreeSet<>(new CompareTo());
        tsall.addAll(s);

        for(Person per: tsall){
            System.out.println(per);
        }

    }
}
