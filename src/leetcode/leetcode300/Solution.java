package leetcode.leetcode300;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public int lengthOfLIS(int[] nums){
        int res = 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int num : nums){
            int i = 0, j = res;
            while (i < j){
                int mid = (i + j) / 2;
                if (dp[mid] < num) i = mid + 1;
                else j = mid;
            }
            if (j == res) res ++;
            dp[j] = num;
        }
        return res;
    }
}
