package leetcode.leetcode1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        map.put(nums[0],0);
        Integer pos1;
        for (int i = 1; i < nums.length; i ++){
            if ((pos1 = map.get(target - nums[i])) != null){
                int[] result = {pos1,i};
                return result;
            }else
                map.put(nums[i],i);
        }
        return null;
    }
}