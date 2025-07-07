package org.example.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome solution = new ValidPalindrome();

    @Test
    void testIsPalindromeExample1() {
        String s = "Was it a car or a cat I saw?";
        assertTrue(solution.isPalindrome(s));
    }

    @Test
    void testIsPalindromeExample2() {
        String s = "tab a cat";
        assertFalse(solution.isPalindrome(s));
    }

    @Test
    void testIsPalindromeWithNumbersAndPunctuation() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(s));
    }

    @Test
    void testNonAlphanumericString() {
        String s = ".,";
        assertTrue(solution.isPalindrome(s));
    }

    @Test
    void testSimpleNonPalindrome() {
        String s = "hello";
        assertFalse(solution.isPalindrome(s));
    }
}