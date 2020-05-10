package Tencent;

import java.util.Scanner;

public class Main5 {

    public static int depth(long number){
        int i = 0;
        for (i = 1; i <= 60; i ++){
            if (number <= Math.pow(2,i) - 1)
                return i;
        }
        return i;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(Math.pow(2,60));
        int n = scan.nextInt();
        for (int i = 0; i < n; i ++){
            long x = scan.nextLong();
            int k = scan.nextInt();
            int depth = depth(x);
            if (depth <= k) {
                System.out.println(-1);
                continue;
            }
            int temp = depth - k;
            while (temp -- > 0)
                x /= 2;
            System.out.println(x);
        }
    }
}
