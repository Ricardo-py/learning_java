package Sword_offer.offer26;

import Sword_offer.TreeNode;
import org.junit.Test;

import java.sql.Connection;

public class Solution {

    @Test
    public void run(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Convert(root);
    }

    public TreeNode Convert(TreeNode root)
    {
        if (root == null) return null;
        if (root.left == null && root.right == null) return root;
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        while (p != null && p.right != null)
            p = p.right;
        if (left != null){
            p.right = root;
            root.left = p;
        }
        TreeNode right = Convert(root.right);
        if (right != null){
            root.right = right;
            right.left = root;
        }
        return left != null ? left : right;
    }
}
