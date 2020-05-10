package Tencent;

import java.util.Scanner;
public class Main1 {

    static class node{
        private long data;
        private node next = null;
        public node(long data){this.data = data;}
    }

    static class Queue{
        private long size = 0;
        private node head = null;
        private node tail = null;
        public Queue(){
            this.head = this.tail = null;
            this.size = 0;
        }
        public boolean add(long data){
            this.size ++;
            if (this.head == null) {
                this.head = new node(data);
                this.tail = this.head;
                return true;
            }else{
                node n = new node(data);
                this.tail.next = n;
                this.tail = n;
                return true;
            }
        }

        public long poll(){
            long data = this.head.data;
            if (this.head != null)
                this.head = this.head.next;
            this.size --;
            return data;
        }

        public long peek(){
            return this.head.data;
        }

        public boolean isEmpty(){
            if (size > 0)
                return false;
            return true;
        }
        public long size(){
            return this.size;
        }
        public void clear(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        while (n -- > 0){
            Queue queue = new Queue();
            int num = scan.nextInt();
            for (int i = 0; i < num; i ++){
                String command = scan.next();
                if ("PUSH".equals(command)){
                    long number = scan.nextLong();
                    queue.add(number);
                }else if ("TOP".equals(command)){
                    if (!queue.isEmpty())
                        System.out.println(queue.peek());
                    else
                        System.out.println(-1);
                }else if ("POP".equals(command)){
                    if (!queue.isEmpty())
                        queue.poll();
                    else
                        System.out.println(-1);
                }else if ("SIZE".equals(command)){
                    System.out.println(queue.size());
                }else if ("CLEAR".equals(command)){
                    queue.clear();
                }
            }
        }
    }
}

