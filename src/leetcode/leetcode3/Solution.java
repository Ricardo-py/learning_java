package leetcode.leetcode3;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int res = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i ++){
            j = Math.max(index[s.charAt(i)],j);
            res = Math.max(res,i - j + 1);
            index[s.charAt(i)] = Math.max(i + 1, j);
        }
        return res;
    }
}
