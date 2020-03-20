package Sword_offer.offer43;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        String str = "abcXYZdef";
        System.out.println(LeftRotateString(str,10));
    }
    public String LeftRotateString(String str, int n){
        if (str == null || str.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        return sb.substring(n % str.length(),str.length() + n % str.length());
    }
}
