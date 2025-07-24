package org.example.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    private GenerateParentheses generateParentheses;

    @BeforeEach
    void setUp(){
        this.generateParentheses = new GenerateParentheses();
    }

    @Test
    void one(){
        assertEquals(generateParentheses.generateParenthesis(1).get(0), "()");
    }

    @Test
    void two(){
        String[] expected = {"((()))","(()())","(())()","()(())","()()()"};


        assertEquals(generateParentheses.generateParenthesis(3).get(4), expected[4]);
    }
}