package leetcode.leetcode_04_05_合法二叉搜索树;

import Sword_offer.TreeNode;

public class Solution {
    private int temp = Integer.MIN_VALUE;
    private boolean Valid = true;
    private boolean firstVisit = true;
    public boolean isValidBST(TreeNode root) {
        isValid(root);
        return Valid;
        }

    public void isValid(TreeNode root){
        if (root == null || Valid == false)
        return ;
        if (root.left != null)
        isValid(root.left);

        if (root.val <= temp && !firstVisit){
        Valid = false;
        return;
        }
        firstVisit = false;
        temp = root.val;
        if (root.right != null)
        isValid(root.right);
        }
}
