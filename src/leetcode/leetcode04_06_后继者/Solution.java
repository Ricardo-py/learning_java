package leetcode.leetcode04_06_后继者;

import Sword_offer.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 肯定是要找到这个节点，找到这个节点后在分情况讨论
 1.这个节点是叶子节点，是其父节点的左子节点：那么他的父节点就是他的下一个节点
 2.这个节点是叶子节点，是其父节点的右子节点，那么
 也不用这么讨论，直接打标记就行了
 */
class Solution {
    private TreeNode res = null;
    private TreeNode temp = null;
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        InOrder(root,p);
        return res;
    }

    public TreeNode InOrder(TreeNode root, TreeNode p){
        if (root == null){
            return root;
        }
        InOrder(root.left,p);
        if (temp == p)
            res = root;
        temp = root;
        InOrder(root.right,p);
        return root;
    }
}
