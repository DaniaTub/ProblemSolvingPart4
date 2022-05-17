package com.leetcode.Dania;
//Given an integer array nums,
// find the contiguous subarray
// (containing at least one number) which has the largest sum and return its sum.
public class SolutionFour
{
    public int maxSubArray(int[] nums)
    {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];

        int dp_0 = nums[0], dp_1 = 0;
        int res = dp_0;


        for (int i = 1; i < n; i++)
        {
            dp_1 = Math.max(nums[i], nums[i] + dp_0);
            dp_0 = dp_1;
            res = Math.max(res, dp_0);
        }

        return res;

    }


}
