package org.example.twoPointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoIntegerSumIITest {

    private final TwoIntegerSumII solution = new TwoIntegerSumII();

    @Test
    void testTwoSumIIExample1() {
        int[] numbers = {1, 2, 3, 4};
        int target = 3;
        int[] expected = {1, 2};
        int[] actual = solution.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwoSumIIWithNegativeNumbers() {
        int[] numbers = {-3, 0, 2, 5, 8};
        int target = 5;
        int[] expected = {1, 5};
        int[] actual = solution.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwoSumIIAtEnds() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        int[] actual = solution.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
    @Test
    void one() {
        int[] numbers = {-5,-3,0,2,4,6,8};
        int target = 5;
        int[] expected = {2, 7};
        int[] actual = solution.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
}