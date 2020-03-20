package Sword_offer.offer57;

import Sword_offer.TreeLinkNode;
import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        TreeLinkNode root = new TreeLinkNode(1);
        root.next = null;
//        TreeLinkNode root_left = root.left = new TreeLinkNode(2);
//        root_left.next = root;
//        TreeLinkNode root_right = root.right = new TreeLinkNode(3);
//        root.right.next = root;
//        TreeLinkNode root_left_left = root_left.left = new TreeLinkNode(4);
//        root_left_left.next = root_left;
//        TreeLinkNode root_right_left = root_right.left = new TreeLinkNode(6);
//        TreeLinkNode root_right_right = root_right.right = new TreeLinkNode(7);
//        root_right_left.next = root_right;
//        root_right_right.next = root_right;
//        root_left_left.right = new TreeLinkNode(8);
//        root_left_left.right.next = root_left_left;
//        root_right_left.right = new TreeLinkNode(9);
//        root_right_left.right.next = root_right_left;
        System.out.println(GetNext(root) == null);
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode == null)
            return null;
        if (pNode.right != null){
            TreeLinkNode rightNode = pNode.right;
            while (rightNode.left != null)
                rightNode = rightNode.left;
            return rightNode;
        }
        TreeLinkNode root = null;
        if (pNode != null)
            root = pNode.next;
        while (root != null && root.left != pNode){
            pNode = root;
            root = pNode.next;
        }
        return root;
    }
}
