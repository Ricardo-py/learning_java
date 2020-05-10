package leetcode.leetcode538;

import Sword_offer.TreeNode;

public class Solution {
    private int sum = 0;
    private int temp = 0;
    public TreeNode convertBST(TreeNode root) {
        Inorder(root);
        return root;
    }

    public void Inorder(TreeNode root){
        if (root == null)
            return;
        Inorder(root.right);
        temp = root.val;
        root.val += sum;
        sum += temp;
        Inorder(root.left);
    }
}
