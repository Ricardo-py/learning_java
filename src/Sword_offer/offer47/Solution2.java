package Sword_offer.offer47;

import org.junit.Test;

public class Solution2 {

    @Test
    public void run(){
        System.out.println(Sum_Solution(100));
    }


    public int Sum_Solution(int n){
        int temp = 0;
        boolean bb = (n > 0) &&((temp = Sum_Solution(n - 1)) > 0);
        return n + temp;
    }
}
