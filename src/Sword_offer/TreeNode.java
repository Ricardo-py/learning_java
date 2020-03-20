package Sword_offer;


import com.sun.source.tree.Tree;

public class TreeNode {
    public int val = 0;
    public TreeNode left = null;
    public TreeNode right = null;
    public TreeNode(int x) { val = x; }

    public static void preOrder(TreeNode root){
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
        return ;
    }

    public static void inOrfer(TreeNode root){
        if (root == null)
            return;
        if (root.left != null)
            inOrfer(root.left);
        System.out.println(root.val);
        if (root.right != null)
            inOrfer(root.right);
    }

}