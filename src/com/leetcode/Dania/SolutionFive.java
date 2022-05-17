package com.leetcode.Dania;
//Reverse Linked List

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val)
    { this.val = val; }
    ListNode(int val, ListNode next)
    { this.val = val; this.next = next; }
}
public class SolutionFive
{
    public ListNode reverseList(ListNode head)
    {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode curNode = temp;
            ListNode curNext = curNode.next;
            curNode.next = prev;

            prev = temp;
            temp = curNext;
        }

        return prev;
    }

}
