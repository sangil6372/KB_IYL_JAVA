package ch15.hard.sec05.exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 30));
        list.add(new Person("Charlie", 20));

        Collections.sort(list);

        for (Person p : list) {
            System.out.println(p.name + " " + p.age);
        }
    }
}
