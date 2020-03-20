package Sword_offer.offer56;

import Sword_offer.ListNode;
import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        ListNode pHead = null;
//        pHead = ListNode.add(pHead,1);
//        pHead = ListNode.add(pHead,1);
//        pHead = ListNode.add(pHead,1);
//        pHead = ListNode.add(pHead,1);
//        pHead = ListNode.add(pHead,1);
//        pHead = ListNode.add(pHead,1);
//        pHead = ListNode.add(pHead,1);
//        ListNode.print(pHead);
        ListNode.print(deleteDuplication(pHead));
    }

    public ListNode deleteDuplication(ListNode pHead){
        ListNode t = new ListNode(0);
        t.next = pHead;
        ListNode tempHead = t;
        ListNode p1 = tempHead, p2 = pHead, p3 = pHead.next;
        if (pHead == null)
            return null;
        while (p3 != null){
            if (p2.val != p3.val){
                p1 = p1.next;
                p2 = p2.next;
                p3 = p3.next;
            }else{
                while (p2.val == p3.val){
                    p3 = p3.next;
                    if (p3 == null)
                        break;
                }
                p2 = p3;
                p1.next = p2;
                if (p3 != null)
                    p3 = p2.next;
            }
        }
        return t.next;
    }
}
