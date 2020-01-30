package Sword_offer.offer24;

import Sword_offer.TreeNode;

import java.util.ArrayList;

public class Solution {
    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null)
            return res;
        ArrayList<Integer> arr = new ArrayList();
        getResult(root,0,arr,target);
        return res;
    }

    public void getResult(TreeNode root, int sum, ArrayList<Integer> arr, int target){
        if (root == null)
            return;
        if (root.left == null && root.right == null && sum + root.val== target){
            arr.add(root.val);
            res.add((ArrayList<Integer>) arr.clone());
            arr.remove(arr.size() - 1);
            return ;
        }
        if (sum <= target){
            arr.add(root.val);
            getResult(root.left,sum + root.val, arr,target);
            getResult(root.right, sum + root.val,arr,target);
            arr.remove(arr.size() - 1);
        }
        return ;
    }
}
