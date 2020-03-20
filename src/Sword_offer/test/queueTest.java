package Sword_offer.test;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class queueTest {
    @Test
    public void run(){
        Queue q = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(null);
        System.out.println(q.size());
        System.out.println(q.remove());
        System.out.println(q.size());
    }
}
