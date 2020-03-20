package Sword_offer.offer55;

import Sword_offer.ListNode;
import org.junit.Test;

public class Solution2 {

    @Test
    public void run(){
        ListNode p = new ListNode(1);
        p.next = new ListNode(2);
        p.next.next = new ListNode(3);
        p.next.next.next = new ListNode(4);
        p.next.next.next.next = new ListNode(5);
        p.next.next.next.next.next = p.next.next;
        System.out.println(EntryNodeOfLoop(p).val);
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode p1=pHead,p2=pHead;
        while (p1 != p2){
            if(p1 != null)
                p1 = p1.next;
            else
                return null;
            if(p2 != null && p2.next != null)
                p2 = p2.next.next;
            else
                return null;
        }
        p2 = pHead;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
