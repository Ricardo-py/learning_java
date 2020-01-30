package Sword_offer.offer28;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        int[] arr = {1,2,3,2,4,2,5,2,3};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0)
            return 0;
        int num = 1, tempnum = array[0];
        for (int i = 1; i < array.length; i ++){
            if (array[i] != tempnum)
                num --;
            else
                num ++;
            if (num == 0) {
                tempnum = array[i];
                num = 1;
            }
        }
        num = 0;
        for (int i = 0; i < array.length; i ++)
            if (array[i] == tempnum)
                num ++;
        if (num <= array.length / 2)
            return 0;
        return tempnum;
    }
}
