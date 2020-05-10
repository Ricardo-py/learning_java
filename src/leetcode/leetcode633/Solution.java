package leetcode.leetcode633;

import com.alibaba.druid.sql.visitor.functions.Char;
import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        System.out.println(judgeSquareSum(10));
    }

    public boolean judgeSquareSum(int c) {
        StringBuilder sb = new StringBuilder();
        long left = 0;
        long right = c;
        while (left <= right){
            if (left * left + right * right > c)
                right --;
            else if (left * left + right * right < c)
                left ++;
            else
                return true;
        }
        return false;
    }
}
