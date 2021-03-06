package com.madhurtoppo.arrays.leetcode.q11container_with_most_water;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;
    private int[] height;

    @BeforeEach
    void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void twoPointerTest1() {
        height = new int[]{1,8,6,2,5,4,8,3,7};
        assertEquals(49, containerWithMostWater.twoPointer(height));
    }

    @Test
    void twoPointerTest2() {
        height = new int[]{4,3,2,1,4};
        assertEquals(16, containerWithMostWater.twoPointer(height));
    }
}