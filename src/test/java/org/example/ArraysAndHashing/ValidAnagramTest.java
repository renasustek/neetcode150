package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void testIsAnagramShouldReturnTrue() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testIsNotAnagramShouldReturnFalse() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void testDifferentLengthStringsShouldReturnFalse() {
        assertFalse(solution.isAnagram("hello", "hell"));
    }

    @Test
    void test4ReturnFalse() {
        assertFalse(solution.isAnagram("aacc", "ccac"));
    }
}