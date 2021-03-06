package com.madhurtoppo.dpandrecursion.leetcode.q70climbing_stairs;

import com.madhurtoppo.dpandrecursion.leetcode.q70climbing_stairs.ClimbingStairs;
//import com.madhurtoppo.leetcode.dpandrecursion.ClimbingStairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private ClimbingStairs climbingStairs;
    private int n;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    void recursiveTest1() {
        n = 3;
        actual = climbingStairs.recursive(n);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void recursiveTest2() {
        n = 3;
        actual = climbingStairs.recursive(n);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest1() {
        n = 7;
        actual = climbingStairs.iterative(n);
        expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest2() {
        n = 7;
        actual = climbingStairs.iterative(n);
        expected = 21;
        assertEquals(expected, actual);
    }
}