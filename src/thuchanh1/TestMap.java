package thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",35);
        hashMap.put("Lewis",22);
        hashMap.put("Cook",39);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75F, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 35);
        linkedHashMap.put("Lewis", 22);
        linkedHashMap.put("Cook",39);
        System.out.println("The age for "+"Lewis is "+linkedHashMap.get("Lewis"));
    }
}
