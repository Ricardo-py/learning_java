package Sword_offer.offer4;

import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.Test;

public class Solution2 {
    private int pos = 0;

    @Test
    public void run(){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = reConstructBinaryTree(pre,in);
        TreeNode.inOrfer(root);
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0)
            return null;
        return getRes(pre,in,0,pre.length);
    }

    public TreeNode getRes(int [] pre, int [] in, int begin, int end){
        if (pos >= pre.length)
            return null;
        if (begin > end)
            return null;
        int i = begin;
        boolean flag = false;
        for ( ; i < end; i ++)
            if (pre[pos] == in[i]) {
                flag = true;
                break;
            }
        if (flag == false)
            return null;
        int mid = i;
        TreeNode root = new TreeNode(pre[pos ++]);
        root.left = getRes(pre,in,begin,mid);
        root.right = getRes(pre,in,mid + 1, end);
        return root;
    }
}
