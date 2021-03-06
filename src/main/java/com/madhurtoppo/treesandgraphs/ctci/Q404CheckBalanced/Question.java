package com.madhurtoppo.treesandgraphs.ctci.Q404CheckBalanced;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

public class Question {

    public static class Recursive {
        public boolean isBalanced(TreeNode root) {
            return checkHeight(root) != Integer.MIN_VALUE;
        }

        private int checkHeight(TreeNode root) {
            if (root == null) {
                return -1;
            }
            int leftHeight = checkHeight(root.left);
            if (leftHeight == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            int rightHeight = checkHeight(root.right);
            if (rightHeight == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            int heightDiff = leftHeight - rightHeight;
            if (Math.abs(heightDiff) > 1) {
                return Integer.MIN_VALUE;
            }
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
