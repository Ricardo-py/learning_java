package leetcode.leetcode21;
import leetcode.leetcode19.*;

import org.junit.Test;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {

    @Test
    public void run(){
        int [] nums1 = {4, 2, 1};
        int [] nums2 = {4, 3, 1};
        ListNode l1 = null,l2 = null;
        l1 = add(l1,nums1);
        l2 = add(l2,nums2);
        printvalue(mergeTwoLists(l1,l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode p1,p2;
        ListNode result[] = new ListNode[2];
        for(p1=l1,p2=l2; p1 != null && p2 != null;){
            System.out.println("執行");
            if (p1.val < p2.val) {
                result = add(result[0], result[1], p1.val);
                p1 = p1.next;
            }
            else {
                result = add(result[0], result[1], p2.val);
                p2 = p2.next;
            }
        }
        while (p1 != null){
            System.out.println("執行2");
            result = add(result[0],result[1],p1.val);
            p1 = p1.next;
        }
        while (p2 != null){
            System.out.println("執行3");
            result = add(result[0], result[1],p2.val);
            p2 = p2.next;
        }
        return result[0];
    }

    public ListNode[] add(ListNode head, ListNode tail, int val){
        if (head == null) {
            head = new ListNode(val);
            head.next = null;
            tail = head;
        }else {
            ListNode temp = new ListNode(val);
            temp.next = null;
            tail.next = temp;
            tail = temp;
        }

        ListNode[] result = {head,tail};
        return result;
    }
    public ListNode add(ListNode listHead, int[] nums){
        if (listHead == null) {
            listHead = new ListNode(nums[0]);
            listHead.next = null;
        }
        for (int i = 1; i < nums.length; i ++){
            ListNode temp = new ListNode(nums[i]);
            temp.next = listHead;
            listHead = temp;
        }
        return listHead;
    }

    public void printvalue(ListNode listHead){
        ListNode temp = listHead;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
