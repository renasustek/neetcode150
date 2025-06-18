package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void testTwoSumExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = solution.twoSum(nums, target);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwoSumExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = solution.twoSum(nums, target);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwoSumExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = solution.twoSum(nums, target);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
