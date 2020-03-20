package Sword_offer.offer59;

import Sword_offer.TreeLinkNode;
import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;

import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {


    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        if (pRoot == null)
            return res;
        q.offer(pRoot);
        q.offer(new TreeNode(0x3f3f3f3f));
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        boolean flag = false;
        while (!q.isEmpty()){
            TreeNode qfront = q.remove();
            if (qfront.val == 0x3f3f3f3f) {
                res.add(new ArrayList<>(arr));
                flag = !flag;
                arr = new ArrayList<Integer>();
                q.add(new TreeNode(0x3f3f3f3f));
            }else{
                arr.add(qfront.val);
                if (flag){
                    if (qfront.left != null)
                        s.push(qfront.left);
                    if (qfront.right != null)
                        s.push(qfront.right);
                    while(!s.isEmpty())
                        q.offer(s.pop());
                }else{
                    if (qfront.left != null)
                        q.offer(qfront.left);
                    if (qfront.right != null)
                        q.offer(qfront.right);
                }
            }
        }
        return res;
    }
}
