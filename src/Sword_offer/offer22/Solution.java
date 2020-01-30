package Sword_offer.offer22;

import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    @Test
    public void run(){
        TreeNode root;
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        System.out.println(PrintFromTopToBottom(null));
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        ArrayList<Integer> res = new ArrayList();
        if (root == null)
            return  res;
//        TreeNode r = q.peek();
        while (!q.isEmpty()){
            TreeNode r = q.peek();
            q.remove();
            res.add(r.val);
            if (r.left != null)
                q.offer(r.left);
            if (r.right != null)
                q.offer(r.right);
        }
        return res;
    }
}
