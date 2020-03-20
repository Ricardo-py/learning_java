package Sword_offer.offer62;

import Sword_offer.TreeNode;
import org.junit.Test;

import java.beans.Transient;

public class Solution {
    private int m = 0;
    private TreeNode res = null;
    private int length = 0;
    @Test
    public void run(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        KthNode(root,8);
        System.out.println(res.val);
    }
    TreeNode KthNode(TreeNode pRoot, int k){
        getRes(pRoot,k);
        if (k > length || k < 1)
            return null;
        return res;
    }

    public void getRes(TreeNode pRoot, int k){
        if (pRoot == null)
            return;
        if (pRoot.left != null)
            getRes(pRoot.left, k);
        m ++;
        length ++;
        if (m == k)
            res = pRoot;
        if (pRoot.right != null)
            getRes(pRoot.right, k);
        return;
    }
}
