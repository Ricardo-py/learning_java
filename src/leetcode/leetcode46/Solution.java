package leetcode.leetcode46;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arr = new ArrayList();
        getRes(nums,0,arr);
        return res;
    }

    public void getRes(int[] nums,int pos, ArrayList<Integer> arr){
        if (pos == nums.length){
            ArrayList<Integer> temp = new ArrayList(arr);
            res.add(temp);
            return ;
        }
        for (int i = 0; i < nums.length; i ++){
            if (!arr.contains(nums[i])){
                arr.add(nums[i]);
                getRes(nums,pos + 1,arr);
                arr.remove(arr.size() - 1);
            }
        }
    }

}