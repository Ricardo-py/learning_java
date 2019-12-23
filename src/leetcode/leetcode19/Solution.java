package leetcode.leetcode19;

import org.junit.Test;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Solution {

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
    @Test
    public void run(){
        ListNode listHead = null;
        int[] nums = {3,2,1};
        listHead = add(listHead,nums);
        printvalue(removeNthFromEnd(listHead,3));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            length ++;
        }
        int number = length - n;
        ListNode listtemp = new ListNode(0);
        listtemp.next = head;
        for (int i = 0; i < number; i ++){
            listtemp = listtemp.next;
        }
        if (listtemp.next == head) {
            head = head.next;
        }
        listtemp.next = listtemp.next.next;
        return head;
    }

    public ListNode result(ListNode node,int n, int number){
        if (node == null)
            return null;
        if (n == number){
            node.next = node.next.next;
        }
        result(node.next,n + 1,number);
        return node;
    }
}

