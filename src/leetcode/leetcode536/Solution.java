package leetcode.leetcode536;

import Sword_offer.TreeNode;
import org.junit.Test;

public class Solution {
    private int pos = 0;

    @Test
    public void run(){
        String s = "-4(2(3)(1))(6(5)(7))";
        str2tree(s);
    }

    public TreeNode str2tree(String s) {
        return getRes(s);
    }

    public TreeNode getRes(String s){
        TreeNode root = null;
        if (pos >= s.length())
            return null;
        if (pos < s.length() && s.charAt(pos) == '-'){
            pos ++;
            root = new TreeNode(s.charAt(pos) - '0');
            pos ++;
        }
        if (s.charAt(pos) >= '0' || s.charAt(pos) <= '9'){
            root = new TreeNode(s.charAt(pos) - '0');
            pos ++;
        }
        if (pos < s.length() && s.charAt(pos) == '(') {
            ++pos;
            root.left = getRes(s);
        }
        if (pos < s.length() && s.charAt(pos) == ')'){
            pos ++;
            return root;
        }
        if (pos < s.length() && s.charAt(pos) == '(') {
            ++pos;
            root.right = getRes(s);
        }
        if (pos < s.length() && s.charAt(pos) == ')'){
            pos ++;
            return root;
        }
        return root;
    }
}
