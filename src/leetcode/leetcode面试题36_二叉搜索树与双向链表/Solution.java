package leetcode.leetcode面试题36_二叉搜索树与双向链表;

import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.Test;

public class Solution {

    @Test
    public void run() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        treeToDoublyList(root);
    }

    public TreeNode treeToDoublyList(TreeNode root) {
        TreeNode head = getRes(root);
        TreeNode temp = head;
        while (temp != null && temp.right != null)
            temp = temp.right;
        head.left = temp;
        temp.right = head;
        return head;
    }

    public TreeNode getRes(TreeNode root){
        if (root == null)
            return null;
        TreeNode left = null;
        if (root.left != null)
            left = getRes(root.left);
        TreeNode right = left;
        while (right != null && right.right != null)
            right = right.right;

        if (right != null){
            right.right = root;
            root.left = right;
        }
        right = getRes(root.right);
        root.right = right;
        right.left = root;
        return left == null ? root : left;
    }
}
