package leetcode.leetcode面试题55;

import Sword_offer.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }

    public int getDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
