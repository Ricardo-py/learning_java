package leetcode.leetcode530;

import Sword_offer.TreeNode;

class Solution {
    private int res = Integer.MAX_VALUE;
    private int temp = -1;
    public int getMinimumDifference(TreeNode root) {
        Inorder(root);
        return res;
    }

    public void Inorder(TreeNode root){
        if (root == null)
            return;
        Inorder(root.left);
        if (temp != -1)
            res = Math.min(res,Math.abs(root.val - temp));
        temp = root.val;
        Inorder(root.right);
    }
}
