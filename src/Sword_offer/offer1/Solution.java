package Sword_offer.offer1;

import org.junit.Test;

public class Solution{

    @Test
    public void test(){
        int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(7,array));
    }

    public boolean Find(int target, int [][] array){
        if (array == null || array.length == 0)
            return false;
        int right = array[0].length - 1;
        int top = 0;
        while (true){
            if (right >= array[0].length || right < 0)
                return false;
            if (top < 0 || top >= array.length)
                return false;
            if (array[top][right] < target)
                top ++;
            else if (array[top][right] > target)
                right --;
            else
                return true;
        }
    }



}
