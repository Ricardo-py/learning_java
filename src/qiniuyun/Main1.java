package qiniuyun;

import java.util.Scanner;

public class Main1 {

    static int[] pre;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        pre = new int[n + 1];
        init(n);
        int x = 1, y = 1;
        while (m -- > 0){
            x = scan.nextInt();
            y = scan.nextInt();
            Join(x,y);
        }
        boolean flag = true;
        int f = Find(x);
        for (int i = 1; i <= n; i ++)
            if (Find(i) != f){
                flag = false;
                System.out.println("NO");
                break;
            }
        if (flag)
            System.out.println("YES");
    }

    public static void init(int n){
        for (int i = 0; i <= n; i ++)
            pre[i] = i;
    }

    public static int Find(int x){
        int temp = x;
        while (pre[x] != x){
            x = pre[x];
        }
        return x;
    }

    public static void Join(int x, int y){
        int prex = Find(x);
        int prey = Find(y);
        if (prex != prey)
            pre[prex] = prey;
    }

}
