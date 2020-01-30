package Sword_offer.offer6;

public class Solution {

    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0)
            return 0;
        int minvalue = 0x3f3f3f3f;
        for (int i = 0; i < array.length; i ++)
            if (minvalue > array[i])
                minvalue = array[i];
        return minvalue;
    }
}
