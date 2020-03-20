package Sword_offer.offer48;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        System.out.println(Add(13,10));
    }
    public int Add(int num1, int num2){
        while (num1 != 0){
            int temp = num1 ^ num2;
            num1 = (num1 & num2) << 1;
            num2 = temp;
        }
        return num2;
    }
}
