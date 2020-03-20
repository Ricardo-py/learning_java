package Sword_offer;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode add(ListNode head,int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        return head;
    }

    public static void print(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}