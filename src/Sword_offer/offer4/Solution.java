package Sword_offer.offer4;

import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.Test;

public class Solution {

    private int pos = 0;
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return null;
    }
    @Test
    public void run(){
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        TreeNode t = build(pre,in,0,in.length - 1);
        preOrder(t);
        inOrder(t);
    }

    public void preOrder(TreeNode t){
        if (t == null)
            return;
        if (t != null)
            System.out.println(t.val);
        preOrder(t.left);
        preOrder(t.right);
    }
    public void inOrder(TreeNode t){
        if (t == null)
            return;
        if (t.left != null)
            inOrder(t.left);
        System.out.println(t.val);
        if (t.right != null)
            inOrder(t.right);
    }
    public TreeNode build(int[] pre, int [] in, int begin, int end){
        if (pre == null || pre.length == 0)
            return null;
        if (pos >= pre.length)
            return null;
        TreeNode t = null;
        int i = begin;
        for (i = begin; i <= end; i ++){
            if (in[i] == pre[pos]){
                t = new TreeNode(in[i]);
                pos ++;
                break;
            }
        }
        if (t == null)
            return null;
        t.left = build(pre,in,begin,i - 1);
        t.right = build(pre,in, i + 1, end);
        return t;
    }
}
