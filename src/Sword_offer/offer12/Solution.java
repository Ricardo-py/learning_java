package Sword_offer.offer12;

import org.junit.Test;

import java.math.BigDecimal;

public class Solution {
    @Test
    public void run(){
        System.out.println(Math.pow(0,3));
//        System.out.println(Power(2,-3));
    }
    public double Power(double base, int exponent){
        if (base == 0)
            return 0;
        exponent = Math.abs(exponent);
        if (exponent < 0)
            return 1.0 / Math.pow(base,exponent);
        return 0;
    }
}
