package Sword_offer.offer39;

import Sword_offer.TreeNode;
import org.junit.Test;

public class Solution {


    @Test
    public void run()
    {
        TreeNode root = new TreeNode(1);
        IsBalanced_Solution(root);
    }
    public boolean IsBalanced_Solution(TreeNode root){
//        root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.left.left.left = new TreeNode(6);
//        root.left.left.right = new TreeNode(7);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(8);
//        System.out.println(isBalanced_Tree(root));
//        return false;
        int number = isBalanced_Tree(root);
        if (number < 0)
            return false;
        else
            return true;
    }

    public int isBalanced_Tree(TreeNode root){
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int depth1 = isBalanced_Tree(root.left);
        int depth2 = isBalanced_Tree(root.right);
        if (depth1 == -1 || depth2 == -1)
            return -1;
        int dis = depth1 > depth2 ? depth1 - depth2:depth2 - depth1;
        if (dis > 1)
            return 0;
        return depth1 > depth2 ? depth1 + 1 : depth2 + 1;
    }
}
