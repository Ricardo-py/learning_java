package Sword_offer.offer47;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        System.out.println(Sum_Solution(3));
    }
    public int Sum_Solution(int n){
        int ans = n;
        boolean b = (ans > 0) && (ans += Sum_Solution(n - 1)) > 0;
        return ans;
    }
}
