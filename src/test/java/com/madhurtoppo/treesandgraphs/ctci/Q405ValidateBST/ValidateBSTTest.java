package com.madhurtoppo.treesandgraphs.ctci.Q405ValidateBST;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.ctci.Q405ValidateBST.ValidateBST;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {

    private static ValidateBST.Iterative iterative;
    private static TreeNode root;
    private static boolean condition;

    @BeforeEach
    void setUp() {
        iterative = new ValidateBST.Iterative();
    }

    @Test
    void iterativeTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5,3,6,2,4,null,7));
        condition = iterative.isValidBST(root);
        assertTrue(condition);
    }

    @Test
    void iterativeTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5,1,4,null,null,3,6));
        condition = iterative.isValidBST(root);
        assertFalse(condition);
    }
}