package leetcode.面试题27_二叉树镜像;

import Sword_offer.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
