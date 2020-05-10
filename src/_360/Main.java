package _360;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        Queue<Integer> q = new LinkedList();
        for (int i = 0; i < n; i ++)
            q.add(scan.nextInt());
        int max_num = 0;
        int first = q.poll();
        int second = 0;
        int result = 0;
        while (max_num < m){
            boolean flag = true;
            second = q.poll();
            if (first < second){
                q.add(first);
                flag = false;
                first = second;
            }else{
                q.add(second);
            }
            if (!flag)
                max_num = 1;
            else
                max_num ++;
            result ++;
        }
        System.out.println(result);
    }
}
