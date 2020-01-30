package Sword_offer.offer9;

public class Solution {
    public int JumpFloorII(int target){
        int result = 1;
        for (int i = 2; i <= target; i ++)
            result = result * 2;
        return result;
    }
}
