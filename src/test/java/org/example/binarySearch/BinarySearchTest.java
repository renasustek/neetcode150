package org.example.binarySearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch;

    @BeforeEach
    void setUp(){
        binarySearch = new BinarySearch();
    }

    @Test
    void one(){
        int[] nums = new int[]{-1,0,2,4,6,8};

        assertEquals(binarySearch.search(nums, 4), 3);
    }

    @Test
    void two(){
        int[] nums = new int[]{-1,0,2,4,6,8};

        assertEquals(binarySearch.search(nums, 3), -1);
    }
    @Test
    void three(){
        int[] nums = new int[]{-1,0,3,5,9,12};

        assertEquals(binarySearch.search(nums, 9), 4);
    }
    @Test
    void four(){
        int[] nums = new int[]{5};

        assertEquals(binarySearch.search(nums, 5), 0);
    }


}