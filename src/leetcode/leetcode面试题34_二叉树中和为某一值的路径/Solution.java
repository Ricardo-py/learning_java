package leetcode.leetcode面试题34_二叉树中和为某一值的路径;

import Sword_offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<Integer> path = new ArrayList();
    private List<List<Integer>> res = new ArrayList();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        getRes(root,sum);
        return res;
    }

    public void getRes(TreeNode root, int target){
        if (root == null)
            return ;
        target -= root.val;
        path.add(root.val);
        if (target == 0 && root.left == null && root.right == null)
            res.add(new ArrayList(path));
        getRes(root.left,target);
        getRes(root.right,target);
        path.remove(path.size() - 1);;
    }
}