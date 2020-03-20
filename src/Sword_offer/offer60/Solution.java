package Sword_offer.offer60;

import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println(Print(root));
    }
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        Queue q = new LinkedList();
        if (pRoot == null)
            return res;
        q.offer(pRoot);
        q.offer(null);
        ArrayList<Integer> arr = new ArrayList<>();
        while (!q.isEmpty()){
            Object front = q.remove();
            if (front == null){
                res.add(new ArrayList<>(arr));
                arr.clear();
                if (q.isEmpty())
                    break;
                q.offer(null);
                continue;
            }
            arr.add(((TreeNode) front).val);
            if (((TreeNode) front).left != null)
                q.offer(((TreeNode) front).left);
            if (((TreeNode) front).right != null)
                q.offer(((TreeNode) front).right);
        }
        return res;
    }
}
