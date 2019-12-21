package multithreading.test_countdownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class test1 {
    public static void main(String args[]){
        CountDownLatch latchbegin = new CountDownLatch(1); //let threads begin together
        CountDownLatch latch = new CountDownLatch(2);
        new Thread(()->{
            try {
                latchbegin.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread1 begin");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        },"1").start();

        new Thread(()->{
            try {
                latchbegin.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2 begin");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        },"2").start();

        System.out.println("wait thread1 and tread2");
        latchbegin.countDown();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
