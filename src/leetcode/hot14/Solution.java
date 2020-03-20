package leetcode.hot14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() == 0)
            return "";
        int minLength = 0x3f3f3f3f;
        for (int i = 0; i < strs.length; i ++)
            if (strs[i].length() < minLength)
                minLength = strs[i].length();
        int res = 0;
        System.out.println(minLength);
        boolean isEnd = false;
        for (int i = 0; i < minLength; i ++){
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++)
                if (strs[j].charAt(i) != ch){
                    isEnd = true;
                    break;
                }
            if (isEnd)
                break;
            res ++;
        }
        return strs[0].substring(0,res);
    }
}
