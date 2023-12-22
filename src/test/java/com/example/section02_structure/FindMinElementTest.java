package com.example.section02_structure;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class FindMinElementTest {
    FindMinElement findMinElement = new FindMinElement();
    int min;
    int[] array = new int[]{1, 2, 3, 4, 5};

    @Test
    void iterative() {
        min = findMinElement.getMin(array);
        assertEquals(1,min);
    }
    @Test
    void recursion1() {
        min = findMinElement.getMin(array, 1, array[0]);
        assertEquals(1,min);
    }
    @Test
    void recursion2() {
        min = findMinElement.getMin(array, 0);
        assertEquals(1,min);
    }

}