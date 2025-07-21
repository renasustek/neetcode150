package org.example.twoPointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSumTest {

    private Set<List<Integer>> convertToSet(List<List<Integer>> lists) {
        Set<List<Integer>> set = new HashSet<>();
        for (List<Integer> list : lists) {
            Collections.sort(list);
            set.add(list);
        }
        return set;
    }

    @Test
    void testExample1() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(-1, -1, 2));
        expectedList.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> actualList = solution.threeSum(nums);

        Set<List<Integer>> expected = convertToSet(expectedList);
        Set<List<Integer>> actual = convertToSet(actualList);

        assertEquals(expected, actual);
    }

    @Test
    void testExample2() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {0, 1, 1};
        List<List<Integer>> expectedList = new ArrayList<>();

        List<List<Integer>> actualList = solution.threeSum(nums);

        Set<List<Integer>> expected = convertToSet(expectedList);
        Set<List<Integer>> actual = convertToSet(actualList);

        assertEquals(expected, actual);
    }

    @Test
    void testExample3() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {0, 0, 0};
        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(0, 0, 0));

        List<List<Integer>> actualList = solution.threeSum(nums);

        Set<List<Integer>> expected = convertToSet(expectedList);
        Set<List<Integer>> actual = convertToSet(actualList);

        assertEquals(expected, actual);
    }

    @Test
    void testGivenExample() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {1, 2, -2, -1};
        List<List<Integer>> expectedList = new ArrayList<>();

        List<List<Integer>> actualList = solution.threeSum(nums);

        Set<List<Integer>> expected = convertToSet(expectedList);
        Set<List<Integer>> actual = convertToSet(actualList);

        assertEquals(expected, actual);
    }
}