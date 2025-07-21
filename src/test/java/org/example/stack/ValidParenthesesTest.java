package org.example.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    void one() {
        String input = "[]";
        assertEquals(validParentheses.isValid(input), true);
    }
    @Test
    void two() {
        String input = "([{}])";
        assertEquals(validParentheses.isValid(input), true);
    }
    @Test
    void three() {
        String input = "[(])";
        assertEquals(validParentheses.isValid(input), false);
    }
    @Test
    void four() {
        String input = "(]";
        assertEquals(validParentheses.isValid(input), false);
    }
    @Test
    void five() {
        String input = "[";
        assertEquals(validParentheses.isValid(input), false);
    }

    @Test
    void six() {
        String input = "((";
        assertEquals(validParentheses.isValid(input), false);
    }

    @Test
    void seven() {
        String input = "(])(])";
        assertEquals(validParentheses.isValid(input), false);
    }
}