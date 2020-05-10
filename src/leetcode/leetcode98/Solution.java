package leetcode.leetcode98;

import Sword_offer.TreeNode;
import org.junit.Test;

public class Solution {
    private boolean res = true;
    private int temp = Integer.MIN_VALUE;

    @Test
    public void run(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        System.out.println(isValidBST(root));
    }

    public boolean isValidBST(TreeNode root) {
        isValid(root);
        return res;
    }

    public int isValid(TreeNode root){
        if (res == false || root == null)
            return Integer.MIN_VALUE;
        if (root.left != null)
            isValid(root.left);
        if (root.val <= temp){
            res = false;
            return Integer.MIN_VALUE;
        }
        temp = root.val;
        if (root.right != null)
            isValid(root.right);
        return root.val;
    }
}
