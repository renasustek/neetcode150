package org.example.stack;

import org.example.stack.DailyTemperatures;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DailyTemperaturesTest {

    private final DailyTemperatures solver = new DailyTemperatures(); // Assuming your class is named DailyTemperatures

    @Test
    void testExample1() {
        int[] temperatures = {30, 38, 30, 36, 35, 40, 28};
        int[] expected = {1, 4, 1, 2, 1, 0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }
    /*
    *
    * 30 38 30 36 35 40 28
    * 1  4   1  2  1
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */

    @Test
    void testExample2() {
        int[] temperatures = {22, 21, 20};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testIncreasingTemperatures() {
        int[] temperatures = {10, 20, 30, 40, 50};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testDecreasingTemperatures() {
        int[] temperatures = {50, 40, 30, 20, 10};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testAllSameTemperatures() {
        int[] temperatures = {25, 25, 25, 25};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testSingleElement() {
        int[] temperatures = {70};
        int[] expected = {0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testTwoElementsWarmer() {
        int[] temperatures = {30, 31};
        int[] expected = {1, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testTwoElementsColder() {
        int[] temperatures = {31, 30};
        int[] expected = {0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testMixedTemperatures() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }

    @Test
    void testLongerArrayWithZeros() {
        int[] temperatures = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        int[] expected = {8, 1, 5, 4, 3, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solver.dailyTemperatures(temperatures));
    }
}