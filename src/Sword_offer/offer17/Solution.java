package Sword_offer.offer17;

import Sword_offer.TreeNode;

public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null){
            result = r2isSubr1(root1,root2);
            if (!result)
                result = HasSubtree(root1.left,root2);
            if (!result)
                result = HasSubtree(root1.right,root2);
        }
        return result;
    }

    public boolean r2isSubr1(TreeNode r1, TreeNode r2){
        if (r1 == null && r2 == null)
            return true;
        else if (r1 != null && r2 == null)
            return true;
        else if (r1 == null && r2 != null)
            return false;
        else if(r1.val == r2.val)
            return r2isSubr1(r1.left,r2.left) && r2isSubr1(r1.right,r2.right);
        else
            return false;
    }
}
