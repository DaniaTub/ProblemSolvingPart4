package com.leetcode.Dania;
//Given an integer array nums,
// return an array answer such that answer[i]
// is equal to the product of all the elements of nums except nums[i].

public class SolutionThree {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; //to take the product of numds array
        int left = 1;
        for (int i = 0; i < nums.length; i++){
            result[i]= left;
            left *=nums[i];
        }
        int right = 1;
        for (int i = nums.length - 1; i>= 0; i--){
            result[i]*=right;
            right*=nums[i];
        }
        return result;
    }
}
