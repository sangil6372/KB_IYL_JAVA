package ch15.basic.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

//       키로 값 얻기
        String key = "banana";
        int value = map.get(key);
        System.out.println(key + "의 값: " + value);
        System.out.println();

//       get keySet collection and iterate
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key2 = keyIterator.next();
            Integer value2 = map.get(key2);
            System.out.println(key2 + "의 값: " + value2);
        }
        System.out.println();

//       Entry set collection and iterate
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Entry<String, Integer> entry = entryIterator.next();
            String key3 = entry.getKey();
            Integer value3 = entry.getValue();
            System.out.println(key3 + "의 값: " + value3);
        }
        System.out.println();

        // Key로 엔트리 삭제
        map.remove("banana");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}
