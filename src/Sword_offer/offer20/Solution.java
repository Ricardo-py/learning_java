package Sword_offer.offer20;

import org.junit.Test;

import java.util.Stack;

public class Solution {

    @Test
    public void run(){
        push(4);
        push(3);
        push(2);
        push(1);
        System.out.println(smin);
    }

    private Stack<Integer> s = new Stack(),smin = new Stack();
    int minvalue = 0x3f3f3f3f;

    public void push(int node) {
        s.push(node);
        if (minvalue > node){
            minvalue = node;
            smin.push(minvalue);
        }
    }

    public void pop() {
        s.pop();
        smin.pop();
    }

    public int top() {
        return (int) s.peek();
    }

    public int min() {
        return (int) smin.peek();
    }
}
