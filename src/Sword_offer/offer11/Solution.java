package Sword_offer.offer11;

public class Solution {
    public int NumberOf1(int n){
        String s = Integer.toBinaryString(n);
        char ch[] = s.toCharArray();
        int result = 0;
        for (int i = 0; i < ch.length; i ++)
            if (ch[i] == '1')
                result ++;
        return result;
    }
}
