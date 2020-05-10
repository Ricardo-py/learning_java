package leetcode.leetcode面试题25;

import Sword_offer.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (l1 != null && l2 != null){
            int minvalue = 0;
            if (l1.val <= l2.val){
                minvalue = l1.val;
                l1 = l1.next;
            }else{
                minvalue = l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode(minvalue);
            tail.next = node;
            tail = node;
        }
        if(l1 != null)
            tail.next = l1;
        if (l2 != null)
            tail.next = l2;
        return head.next;
    }
}