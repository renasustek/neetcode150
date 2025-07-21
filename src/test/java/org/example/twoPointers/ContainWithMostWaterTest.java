package org.example.twoPointers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainWithMostWaterTest {

    private ContainWithMostWater containWithMostWater;

    @BeforeEach
    void setUp(){
         containWithMostWater = new ContainWithMostWater();
    }

    @Test
    void one(){
        int[] array = new int[]{1,7,2,5,4,7,3,6};
        assertEquals(containWithMostWater.maxArea(array), 36);
    }

    @Test
    void two(){
        int[] array = new int[]{2,2,2};
        assertEquals(containWithMostWater.maxArea(array), 4);
    }
}