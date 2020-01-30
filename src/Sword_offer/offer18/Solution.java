package Sword_offer.offer18;

import Sword_offer.TreeNode;
import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
       // Mirror(root);
        TreeNode.preOrder(root);
    }

    public void Mirror(TreeNode root){
        if (root != null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
        return ;
    }
}
