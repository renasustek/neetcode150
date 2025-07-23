package org.example.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {

    @Test
    void testPushAndTop() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        assertEquals(-2, minStack.top());
        minStack.push(0);
        assertEquals(0, minStack.top());
        minStack.push(-3);
        assertEquals(-3, minStack.top());
    }

    @Test
    void testGetMin() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
    }

    @Test
    void testPopAndGetMin() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop(); // Pop -3
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    void testPopMultipleTimesAndGetMin() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop(); // Pop -3
        minStack.pop(); // Pop 0
        assertEquals(-2, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    void testEmptyStackTop() {
        MinStack minStack = new MinStack();
        // Accessing top on an empty stack should ideally throw an exception.
        // We'll assert that it doesn't crash for now.
        assertThrows(RuntimeException.class, () -> minStack.top()); // Or NoSuchElementException
    }

    @Test
    void testEmptyStackGetMin() {
        MinStack minStack = new MinStack();
        // Getting min on an empty stack should ideally throw an exception.
        assertThrows(RuntimeException.class, () -> minStack.getMin()); // Or NoSuchElementException
    }

    @Test
    void testPushPopPush() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.pop();
        minStack.push(2);
        assertEquals(2, minStack.top());
        assertEquals(2, minStack.getMin());
    }

    @Test
    void testPushSameValues() {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(5);
        assertEquals(5, minStack.getMin());
        minStack.pop();
        assertEquals(5, minStack.getMin());
    }

    @Test
    void testOrderOfOperations() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        assertEquals(0, minStack.getMin()); // Current min is 0
        minStack.pop(); // Pop 0
        assertEquals(0, minStack.getMin()); // Min should still be 0 (from the earlier 0)
        minStack.pop(); // Pop 3
        assertEquals(0, minStack.getMin()); // Min should still be 0
        minStack.pop(); // Pop 0
        assertEquals(2, minStack.getMin()); // Min should now be 2
    }
}