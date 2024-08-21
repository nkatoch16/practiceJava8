package com.learnjava.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGrouping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        map.put("Durian", 5);
        map.put("Elderberry", 2);
        map.put("Cherry", 6);
        map.put("q", 3);
        map.put("qwewrwerwerwerwerwerwer", 3);

        var first = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        (Map.Entry::getValue),
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                )).entrySet().stream().findFirst();
        System.out.println(first.get());
        Map.Entry<String, Integer> entryWithMaxValue = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        String valueWithMaxOccurrences = String.valueOf(entryWithMaxValue.getKey());
        long maxOccurrences = entryWithMaxValue.getValue();

        System.out.println("Value with the maximum occurrences: " + valueWithMaxOccurrences);
        System.out.println("Number of occurrences: " + maxOccurrences);

        String aNull = map.keySet().stream()
                .max(CharSequence::compare)
                .orElse("NULL");
        System.out.println(aNull);
    }
}
