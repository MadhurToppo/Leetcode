package com.madhurtoppo.arrays.leetcode.q53maximum_subarray;

public class MaxSubArray {

    public int kadane(int[] nums) {
        var sum = 0;
        var max = Integer.MIN_VALUE;

        for (var num : nums) {
            sum = Math.max(num, sum + num);
            max = Math.max(max, sum);
        }

        return max;
    }
}
