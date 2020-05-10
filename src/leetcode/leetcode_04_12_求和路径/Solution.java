package leetcode.leetcode_04_12_求和路径;

import Sword_offer.TreeNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private int count = 0;

    @Test
    public void run(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        TreeNode root2 = new TreeNode(-2);
        root2.right = new TreeNode(-3);
        System.out.println(pathSum(root,22));
    }

    public int pathSum(TreeNode root, int sum) {
        Set<Integer> set = new HashSet();
        getRes(root,set,0,sum);
        return count;
    }

    public void getRes(TreeNode root, Set<Integer> set, int res, int sum){
        if (root == null) {
            return;
        }
        res += root.val;
        if (res == sum)
            count ++;
        if (set.contains(res - sum))
            count ++;
        set.add(root.val);
        getRes(root.left,set,res,sum);
        getRes(root.right,set,res,sum);
        set.remove(root.val);
    }
}
