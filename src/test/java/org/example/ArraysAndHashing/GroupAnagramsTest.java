package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    private final GroupAnagrams solution = new GroupAnagrams();

    private void sortLists(List<List<String>> lists) {
        for (List<String> list : lists) {
            Collections.sort(list);
        }
        lists.sort(Comparator.comparing(list -> list.get(0)));
    }

    @Test
    void testGroupAnagramsExample1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList("ate", "eat", "tea")));
        expected.add(new ArrayList<>(Arrays.asList("bat")));
        expected.add(new ArrayList<>(Arrays.asList("nat", "tan")));

        List<List<String>> actual = solution.groupAnagrams(strs);

        sortLists(expected);
        sortLists(actual);

        assertEquals(expected, actual);
    }

    @Test
    void testGroupAnagramsExample2() {
        String[] strs = {""};
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Collections.singletonList("")));

        List<List<String>> actual = solution.groupAnagrams(strs);

        sortLists(expected);
        sortLists(actual);

        assertEquals(expected, actual);
    }

    @Test
    void testGroupAnagramsExample3() {
        String[] strs = {"a"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Collections.singletonList("a")));

        List<List<String>> actual = solution.groupAnagrams(strs);

        sortLists(expected);
        sortLists(actual);

        assertEquals(expected, actual);
    }
}