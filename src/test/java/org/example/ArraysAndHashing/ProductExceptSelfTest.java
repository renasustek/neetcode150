package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    private final ProductExceptSelf solution = new ProductExceptSelf();

    @Test
    void testProductExceptSelfExample1() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] actual = solution.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testProductExceptSelfExample2() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] actual = solution.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testProductExceptSelfWithMultipleNegatives() {
        int[] nums = {2, 3, -1, -2, 4};
        int[] expected = {24, 16, -48, -24, 12};
        int[] actual = solution.productExceptSelf(nums);
        assertArrayEquals(expected, actual);
    }
}