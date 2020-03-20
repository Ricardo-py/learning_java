package Sword_offer.offer45;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    @Test
    public void run(){
        int [] numbers = {1,3,0,0,5,7};
        System.out.println(isContinuous(numbers));
    }
    public boolean isContinuous(int [] numbers){
        if (numbers == null || numbers.length == 0)
            return false;
        int num = 0;
        Arrays.sort(numbers);
        int k = 0,i = 0;
        while (k <= 4){
            if (numbers[k] == 0)
                k ++;
            else
                break;
        }
        int tmp = k;
        for (i = k + 1; i < numbers.length; i ++){
            int abs = numbers[i] - numbers[i - 1];
            if (abs == 0)
                return false;
            if (abs > 1)
                tmp -= abs - 1;
            if (tmp < 0)
                return false;
        }
        return true;
    }

}
