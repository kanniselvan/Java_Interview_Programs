package com.kanni;

import java.util.*;

public class SortSummary {
    public static List<List<Integer>> groupSort(List<Integer> arr) {
        List<List<Integer>> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        arr.forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.sort(Map.Entry.comparingByKey());
        System.out.println(list);
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        System.out.println(list);

        list.forEach(entry -> {
            List<Integer> l = new ArrayList<>();
            l.add(entry.getKey());
            l.add(entry.getValue());
            ans.add(l);
        });

        return ans;
    }

    public static void main(String[] str) {

       System.out.println("tes====> "+groupSort(Arrays.asList(12,45,85,12,30,89,20,20,20,89)));

    }
}
