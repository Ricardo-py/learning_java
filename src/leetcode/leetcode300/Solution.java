package leetcode.leetcode300;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class Solution {

    @Test
    public void run(){
        int[] nums = {10,9,2,5,3,7,101,18};
        String a = "1";
        String b = "1.0.0.2";
        String[] temp = b.split("\\.");
        System.out.println(temp.length);

        String ss = "a b c d";
        char[] temps = ss.toCharArray();
        for (int i = 0; i < ss.toCharArray().length;i ++)
            System.out.print(temps[i]);

        //System.out.println(lengthOfLIS(nums));
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
        BigDecimal s = new BigDecimal(11);
        return res;
    }
}
