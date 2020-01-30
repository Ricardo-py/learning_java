package Sword_offer.offer31;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        System.out.println(NumberOf1Between1AndN_Solution(55));
    }
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n <= 0)
            return 0;
        int res = 0;
        for (int i = 1; i <= n; i *= 10){
            int tmp = i * 10;
            res += n / tmp * i;
            if (n % tmp >= 2 * i - 1)
                res += i;
            else if (n % tmp >= i)
                res += n % tmp - i + 1;
        }
        return res;
    }
}
