package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class longestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence solution = new LongestConsecutiveSequence();

    @Test
    void testlongestConsecutiveExample1() {
        int[] nums = {2, 20, 4, 10, 3, 4, 5};
        assertEquals(4, solution.longestConsecutive(nums));
    }

    @Test
    void testlongestConsecutiveExample2() {
        int[] nums = {0, 3, 2, 5, 4, 6, 1, 1};
        assertEquals(7, solution.longestConsecutive(nums));
    }

    @Test
    void testlongestConsecutiveWithEdgeCases() {
        assertEquals(0, solution.longestConsecutive(new int[]{}));
    }

    @Test
    void test1() {
        assertEquals(1, solution.longestConsecutive(new int[]{42}));

    }

    @Test
    void test2() {
        assertEquals(3, solution.longestConsecutive(new int[]{-1, -2, -3, 5}));

    }

    @Test
    void test3() {
        assertEquals(1, solution.longestConsecutive(new int[]{1, 1, 1, 1}));

    }

}