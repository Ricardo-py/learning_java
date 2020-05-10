package leetcode.leetcode680;

import org.junit.Test;

public class Solution {
    @Test
    public void run(){
        System.out.println(validPalindrome("abc"));
    }

    public boolean validPalindrome(String s) {
        for(int i = 0; i < s.length(); i ++){
            StringBuilder sb = new StringBuilder(s);
            if (isLegal(s))
                return true;
        }

        return false;
    }

//    public boolean isLegal(StringBuilder s){
//        boolean flag = true;
//        int left = 0, right = s.length() - 1;
//        while (left < right){
//            if (s.charAt(left) != s.charAt(right)){
//                if (!flag)
//                    return false;
//                flag = false;
//                if (s.charAt(left + 1) == s.charAt(right))
//                    left ++;
//                else if (s.charAt(right - 1) == s.charAt(left))
//                    right --;
//                else
//                    return false;
//                continue;
//            }
//            left ++;
//            right --;
//        }
//        return true;
//    }

    public boolean isLegal(String s){
        int left = 0, right = s.length() - 1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                if (isLegal(s.substring(left,right)))
                    return true;
                else if (isLegal(s.substring(left + 1,right + 1)))
                    return true;
                else
                    return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}