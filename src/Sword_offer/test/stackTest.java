package Sword_offer.test;

import org.junit.Test;

import java.util.Stack;

public class stackTest {

    @Test
    public void run(){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
