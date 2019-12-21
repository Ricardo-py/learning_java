package multithreading;

/*
生产者消费者小练习
 */

public class test1{
    private static int total = 0;
    final private int MAX = 50;
    public synchronized void put(){
        while(total == MAX){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        total ++;
        System.out.println("p:" + total);
        notifyAll();
    }

    public synchronized int get(){
        while (total <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        total --;
        System.out.println("c:" + total);
        notifyAll();
        return 1;
    }
    public static void main(String args[]){
        test1 t1 = new test1();
//        t1.put();
        for (int i = 0; i < 10; i ++)
            new Thread(()->{
                for (int j = 0; j < 5; j ++)
                    t1.get();
            },"c" + i).start();

        for (int i = 0; i < 2; i ++){
            new Thread(()->{
                for (int j = 0; j < 25; j ++) {
                    t1.put();
                }
            },"p" + i).start();
        }

    }
}