package Sword_offer.offer16;

import Sword_offer.ListNode;
import org.junit.Test;

import java.util.List;

public class Solution {

    @Test
    public void run(){
        ListNode temp = new ListNode(1);
        ListNode list1 = null,list2 = null;
        list1 = temp.add(list1,5);
        list1 = temp.add(list1,3);
        list1 = temp.add(list1, 1);
        list2 = temp.add(list2,6);
        list2 = temp.add(list2,4);
        list2 = temp.add(list2,2);
        temp.print(Merge(list1,list2));
    }

    public ListNode Merge(ListNode list1, ListNode list2){
        ListNode l1=list1,l2=list2;
        ListNode rlist = new ListNode(0);
        ListNode ptemp = rlist;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                ListNode p = new ListNode(l1.val);
                ptemp.next = p;
                ptemp = p;
                l1 = l1.next;
            }
            else{
                ListNode p = new ListNode(l2.val);
                ptemp.next = p;
                ptemp = p;
                l2 = l2.next;
            }
        }

        if (l1 != null){
            ptemp.next = l1;
        }
        if(l2 != null){
            ptemp.next = l2;
        }
        return rlist.next;
    }
}
