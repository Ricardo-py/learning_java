package Sword_offer.offer38;

import Sword_offer.TreeNode;

public class Solution {
    private  int depth = -1;
    public int TreeDepth(TreeNode root){
        dfs(root,0);
        return depth;
    }
    public void dfs(TreeNode root, int sum){
        if (root == null){
            if (sum > depth)
                depth = sum;
            return;
        }
        dfs(root.left,sum + 1);
        dfs(root.right, sum + 1);
    }
}
