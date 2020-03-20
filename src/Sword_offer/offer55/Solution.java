package Sword_offer.offer55;

import Sword_offer.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null)
            return null;
        ListNode p1 = pHead, p2 = pHead;
        while (p1 != null && p2 != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == null || p2 == null)
                return null;
            if (p1 == p2)
                break;
        }
        p1 = pHead;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
