package Sword_offer.offer10;

import org.junit.Test;

public class Solution {
    @Test
    public void run(){
        for (int i = 3; i <= 10; i ++)
            System.out.println(RectCover(i));
    }
    public int RectCover(int target){
        if (target <= 2)
            return target;
        int one = 1;
        int two = 1;
        int result = 2;
        for (int i = 3; i <= target; i ++){
            one = two;
            two = result;
            result = one + two;
        }
        return result;
    }
}
