package leetcode.leetcode面试题33_二叉搜索树的后序遍历序列;

class Solution {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null)
            return false;
        return isPostorder(postorder,0,postorder.length - 1);
    }

    public boolean isPostorder(int[] postorder, int first, int last){
        if (first >= last)
            return true;
        int number = postorder[last];
        int i = first;
        while (i < last){
            if (postorder[i] > number)
                break;
            i ++;
        }
        int mid = i;
        while (i < last){
            if (postorder[i] < number)
                return false;
            i ++;
        }
        if (!isPostorder(postorder,first,mid - 1))
            return false;
        if (!isPostorder(postorder,mid,last - 1))
            return false;
        return true;
    }
}