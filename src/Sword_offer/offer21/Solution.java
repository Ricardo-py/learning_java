package Sword_offer.offer21;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Stack;

public class Solution {

    @Test
    public void run(){

        int[] pushA = {1,2,3,4,5};
        int[] popA = {4, 5, 3, 2 ,1};

        System.out.println(IsPopOrder(pushA, popA));
    }

    public boolean IsPopOrder(int [] pushA, int [] popA){
        int i = 0;
        int j = 0;
        Stack<Integer> s = new Stack<>();
        s.push(pushA[i ++]);
        while (j < popA.length){
            while (s.peek() != popA[j] && i < pushA.length)
                s.push(pushA[i ++]);
            if (s.peek() == popA[j]) {
                s.pop();
                j ++;
            }else
                return false;
        }
        if (s.empty())
            return true;
        else
            return false;
    }
}
