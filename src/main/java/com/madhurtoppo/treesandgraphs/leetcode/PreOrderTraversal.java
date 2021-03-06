package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public static class Recursive {

        public List<Integer> preOrder(TreeNode root) {
            List<Integer> values = new ArrayList<>();
            return helper(root, values);
        }

        private List<Integer> helper(TreeNode root, List<Integer> values) {
            if (root == null) {
                return values;
            }
            values.add(root.val);
            helper(root.left, values);
            helper(root.right, values);
            return values;
        }
    }

    public static class Iterative {

        public List<Integer> preOrder(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(node.val);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }

            return list;
        }
    }

}