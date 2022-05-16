package com.leetcode.Dania;
//Best Time to Buy and Sell Stock
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock
// and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction
// . If you cannot achieve any profit, return 0.
public class SolutionOne
{
    public int maxProfit(int[] prices)
    {
        int buy=0;
        int sell=0;
        int profit=0;
        for (int i = 0; i <prices.length ; i++)
        {
            if (prices[i]>prices[buy])
            {
                buy=i; //we deal with days
                sell=i;
            }
            if (prices[i]>prices[sell])
            {
                sell=i;

            }
            if(buy < sell){ // only buy and sell if buy date is less than sell date.
                profit = Math.max(profit, prices[sell] - prices[buy]);
            }
        }

       return  profit;

    }
}
