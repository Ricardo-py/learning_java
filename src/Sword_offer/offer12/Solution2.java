package Sword_offer.offer12;

import org.junit.Test;

public class Solution2 {

    @Test
    public void run(){
        System.out.println(Power(2,-3));
    }

    public double Power(double base, int exponent){
        if (base == 0)
            return 0;
        else if (exponent == 0)
            return 1;
        else if (exponent > 0)
            return getRes(base, exponent);
        else
            return 1.0 / getRes(base,exponent);
    }

    public double getRes(double base, int exponent){
        double res = 1.0;
        for (int i = 0; i < exponent; i ++)
            res *= base;
        return res;
    }
}
