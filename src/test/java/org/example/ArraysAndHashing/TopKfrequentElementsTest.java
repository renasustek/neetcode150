package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    private final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void testTopKFrequentElementsExample1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        int[] actual = solution.topKFrequent(nums, k);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTopKFrequentElementsExample2() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        int[] actual = solution.topKFrequent(nums, k);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

}