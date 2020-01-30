package Sword_offer.offer14;

import Sword_offer.ListNode;

public class Solution {
    private ListNode res;
    public ListNode FindKthToTail(ListNode head, int k){
        getResult(head,k);
        return res;
    }

    public int getResult(ListNode head,int k){
        if (head != null) {
            int result = getResult(head.next, k) + 1;
            if (result == k) {
                res = head;
                return result - 1;
            }
            else
                return result;
        }
        return 0;
    }
}
