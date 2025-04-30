package ch15.hard.sec05.exam04;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
//        List<Fruit> list = new ArrayList<>();
//        list.add(new Fruit("apple", 10));
//        list.add(new Fruit("banana", 20));
//        list.add(new Fruit("orange", 30));
//
//        list.sort(new FruitComparator());

        Set<Fruit> treeSet = new TreeSet<>(new FruitComparator());

        treeSet.add(new Fruit("apple", 10));
        treeSet.add(new Fruit("banana", 20));
        treeSet.add(new Fruit("orange", 30));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
