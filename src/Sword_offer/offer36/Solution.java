package Sword_offer.offer36;

import Sword_offer.ListNode;
import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        ListNode p1 = new ListNode(1);
        p1.next = new ListNode(2);
        p1.next.next = new ListNode(3);
        ListNode p2 = new ListNode(4);
        p2.next = new ListNode(5);
        ListNode temp = new ListNode(6);
        temp.next = new ListNode(7);
        p1.next.next.next = temp;
        p2.next.next = temp;
        ListNode res = FindFirstCommonNode(p1,p2);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = 0, length2 = 0;
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != null){
            length1 ++;
            p1=p1.next;
        }
        while (p2 != null){
            length2 ++;
            p2 = p2.next;
        }
        int abs = 0;
        abs = length1 > length2 ? length1 - length2 : length2 - length1;
        if (length1 > length2)
            return findlist(pHead1,pHead2,abs);
        else
            return findlist(pHead2,pHead1,abs);
    }

    public ListNode findlist(ListNode p1, ListNode p2, int length){
        int i = 0;
        while (i < length){
            p1 = p1.next;
            i ++;
        }
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

}
