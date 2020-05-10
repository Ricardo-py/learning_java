package leetcode.leetcode_04_08_首个共同祖先;

import Sword_offer.TreeNode;

public class Solution {
    private TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        getRes(root,p,q);
        return res;
    }

    public boolean getRes(TreeNode root, TreeNode p, TreeNode q){
        if (root == null){
            return false;
        }

        boolean left = getRes(root.left,p, q);

        boolean right = getRes(root.right, p, q);

        if ((root == p && left) || (root == p && right) || (root == q && left) || (root == q && right) || (left && right)){
            res = root;
            return true;
        }
        if (left || right)
            return true;
        return root == p || root == q ? true : false;
    }
}
