package Sword_offer.offer8;

import org.junit.Test;

public class Solution {
    int sum = 0;

    @Test
    public void run(){
        for (int i = 1; i < 100; i ++) {
            sum = 0;
            System.out.println(JumpFloor(i));
        }

    }

    public int JumpFloor(int target){
        int[] result = new int[39];
        result[0] = 1;
        result[1] = 2;
        for (int i = 2; i < 39; i ++)
            result[i] = result[i - 1] + result[i - 2];
        return result[target];
    }
    public void solve(int target){
        if (target == 0) {
            sum++;
            return;
        }

        if (target < 0)
            return;
        solve(target - 1);
        solve(target - 2);
    }
}
