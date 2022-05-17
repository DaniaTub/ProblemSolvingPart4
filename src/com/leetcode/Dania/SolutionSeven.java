package com.leetcode.Dania;
//Given head, the head of a linked list, determine if the linked list has a cycle in it.
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class SolutionSeven
{
    public boolean hasCycle(ListNode head)
    {
        ListNode fast=head,slow=head;
        if(head==null) return false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }



}