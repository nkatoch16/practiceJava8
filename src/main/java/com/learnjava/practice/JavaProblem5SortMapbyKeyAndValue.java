package com.learnjava.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Sort Map by key and value
public class JavaProblem5SortMapbyKeyAndValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(6, "PE");
        map.put(1, "Math");
        map.put(3, "Social Science");
        map.put(2, "Science");
        map.put(5, "Hindi");
        map.put(4, "English");

        System.out.println("OriginalMap : "+map);

        Map<Integer, String> sortedByValuesMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)-> e1, LinkedHashMap::new));
        System.out.println("sortedByValuesMap : "+sortedByValuesMap);

        Map<Integer, String> sortedByKeysMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
        System.out.println("sortedByKeysMap : "+sortedByKeysMap);


        Map<Integer, String > sortedByKeysMapReverse = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("sortedByKeysMapReverse : "+sortedByKeysMapReverse);

        Map<Integer, String> sortedByValuesMapReversed = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2)->e1,
                        LinkedHashMap::new
                ));

        System.out.println("sortedByValuesMapReversed : "+sortedByValuesMapReversed);




        /*
        Map<Integer, String> sortedByKeyMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        System.out.println("1"+sortedByKeyMap);

        //System.out.println(map);
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Integer, String> sortedByValueMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
        System.out.println("2"+sortedByValueMap);
         */
    }
}
