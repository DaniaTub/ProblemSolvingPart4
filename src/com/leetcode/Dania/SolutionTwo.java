package com.leetcode.Dania;

import java.util.Arrays;

//Given an integer array nums,
// return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class SolutionTwo
{
    public boolean containsDuplicate(int[] nums)
    {
//        for (int i = 0; i <nums.length ; i++)
//        {
//            for (int j = 1; j <nums.length ; j++)
//            {
//             if (nums[i]==nums[j])
//             {
//                 return  true;
//             }
//
//            }
//        }
//
// return  false;
//    }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }
        return false;
    }
}
