package ch15.hard.sec05.exam04;

import ch15.hard.sec05.exam03.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample2 {
    public static void main(String[] args) {
        Set<Fruit> treeSet = new TreeSet<>((f1, f2) -> f1.price - f2.price);

        treeSet.add(new Fruit("apple", 30));
        treeSet.add(new Fruit("banana", 21));
        treeSet.add(new Fruit("orange", 19));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
