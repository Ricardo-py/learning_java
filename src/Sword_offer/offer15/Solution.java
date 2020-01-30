package Sword_offer.offer15;

import Sword_offer.ListNode;
import org.junit.Test;

public class Solution {

    private ListNode res;
    @Test
    public void run(){
        ListNode head = null;
        ListNode head1 = new ListNode(1);
       /* for (int i = 0; i < 5; i ++){
            head = head1.add(head,i);
        }*/
        //head1.print(head);
        head = getRes(head);
        head1.print(res);
    }

    public ListNode getRes(ListNode head){
        if (head == null || head.next == null){
            res = head;
            return head;
        }
        ListNode tmp = ReverseList(head.next);
        tmp.next = head;
        head.next = null;
        return head;
    }
    public ListNode ReverseList(ListNode head){
        if (head.next == null){
            res = head;
            return head;
        }
        ListNode tmp = ReverseList(head.next);
        tmp.next = head;
        head.next = null;
        return head;
        //ReverseList(head.next).next = head;
    }
}
