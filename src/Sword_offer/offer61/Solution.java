package Sword_offer.offer61;

import Sword_offer.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.Test;

import java.io.Serializable;

public class Solution {
    private StringBuilder sb = new StringBuilder();
    private int index = -1;

    @Test
    public void run(){
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        System.out.println(Serialize(root));
        TreeNode.preOrder(Deserialize(sb.toString()));
    }

    String Serialize(TreeNode root) {
        if (root == null)
            return "";
        serialize(root);
        return sb.toString();
    }
    public void serialize(TreeNode root){
        if (root == null){
            sb.append("#!");
            return ;
        }
        sb.append(root.val + "!");
        serialize(root.left);
        serialize(root.right);
    }
    TreeNode Deserialize(String str) {
        String[] strr = str.split("!");
        return deserialize(strr);
    }

    TreeNode deserialize(String[] strr){
        index ++;
        if (index >= strr.length)
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(strr[index]));
        root.left = deserialize(strr);
        root.right = deserialize(strr);
        return root;
    }
}