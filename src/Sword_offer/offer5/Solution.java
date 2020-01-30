package Sword_offer.offer5;

import org.junit.Test;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    @Test
    public void run(){

    }
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()){
            while (!stack1.empty())
                stack2.push(stack1.pop());
            return stack2.pop();
        }
        else
            return stack2.pop();
    }
}
