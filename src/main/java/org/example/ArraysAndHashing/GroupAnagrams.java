package org.example.ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!anagramsMap.containsKey(key)) {
                anagramsMap.put(key, new ArrayList<>());
            }
            anagramsMap.get(key).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }

}
