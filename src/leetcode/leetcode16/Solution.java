package leetcode.leetcode16;

import org.junit.Test;

import java.util.Arrays;

public class Solution{
    @Test
    public void run(){
        int[] nums = {0,2,1,-3};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 1; i ++){
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int temp = nums[i] + nums[l] + nums[r];
                if (Math.abs(temp - target) < Math.abs(result - target))
                    result = temp;
                if (temp < target)
                    l ++;
                else if (temp > target)
                    r --;
                else
                    return result;
            }
        }
        return result;
    }
}
