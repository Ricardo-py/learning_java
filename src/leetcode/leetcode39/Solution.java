package leetcode.leetcode39;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private ArrayList<Integer> temp = new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        getRes(candidates,target,0);
        return res;
    }

    public void getRes(int[] candidates, int target, int pos){
        if (target < 0)
            return ;
        if (target == 0){
            ArrayList<Integer> arr = new ArrayList();
            arr.addAll(temp);
            res.add(arr);
            return ;
        }
        for (int i = pos; i < candidates.length; i ++){
            temp.add(candidates[i]);
            getRes(candidates,target - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}