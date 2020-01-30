package Sword_offer.offer30;


import org.junit.Test;

import java.util.Arrays;

public class Solution {

    @Test
    public void run(){
        int [] array = {6,-3,-2,7,-15,15,-1,-2,4};
        System.out.println(FindGreatestSumOfSubArray(array));
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int maxvalue = dp[0];
        for (int i = 1; i < array.length; i ++){
            int temp;
            if ((temp = dp[i - 1] + array[i]) > array[i])
                dp[i] = temp;
            else
                dp[i] = array[i];
        }
        for (int i = 1; i < dp.length; i ++)
            if (maxvalue < dp[i])
                maxvalue = dp[i];
//        dp = Arrays.copyOf(array,array.length + 1);
//        for (int i = 0; i < array.length; i ++)
//            System.out.println(dp[i]);

        return maxvalue;
    }
}
