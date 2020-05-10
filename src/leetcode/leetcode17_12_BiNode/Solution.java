package leetcode.leetcode17_12_BiNode;

import Sword_offer.TreeNode;
import org.junit.Test;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    @Test
    public void run(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(0);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        TreeNode res = convertBiNode(root);
        while (res != null) {
            System.out.println(res.val);
            res = res.right;
        }
    }

    public TreeNode convertBiNode(TreeNode root) {
        return Biconvert(root);
    }

    public TreeNode Biconvert(TreeNode root){
        if (root == null)
            return null;
        TreeNode left = null;
        if (root.left != null)
            left = Biconvert(root.left);

        TreeNode right = left;
        while(right != null && right.right != null)
            right = right.right;
        if (right != null && right != root)
            right.right = root;

        if (root.right != null)
            root.right = Biconvert(root.right);

        return left == null ? root : left;
    }
}