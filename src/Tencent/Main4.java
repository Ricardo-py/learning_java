package Tencent;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {

    private static Stack<Long> s1 = new Stack<>();
    private static Stack<Long> s2 = new Stack<>();

    public static void add(long number){
        s2.push(number);
    }

    public static void poll(){
        if (s1.isEmpty()){
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        s1.pop();
    }

    public static long peek(){
        if (s1.isEmpty()){
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        return s1.peek();
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        for (int i = 0; i < n; i ++){
            String command = scan.next();
            if ("add".equals(command)){
                long number = scan.nextLong();
                add(number);
            }else if ("peek".equals(command)){
                System.out.println(peek());
            }else if ("poll".equals(command))
                poll();
        }
    }
}
