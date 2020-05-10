package leetcode.leetcode面试题49_丑数;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i ++){
            int n1 = dp[a] * 2, n2 = dp[b] * 3, n3 = dp[c] * 5;
            int minvalue = Math.min(Math.min(n1,n2),n3);
            if (minvalue == n1) a ++;
            if (minvalue == n2) b ++;
            if (minvalue == n3) c ++;
            dp[i] = minvalue;
        }
        return dp[n - 1];
    }
}
