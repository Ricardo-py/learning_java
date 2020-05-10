package wangyi;

import java.util.Scanner;

public class Main3 {

    private static int MAX_LENGTH = 10005;
    private static int[] pre = new int[MAX_LENGTH];
    private static int n;

    private static void init(){
        for (int i = 0; i < n; i ++)
            pre[i] = i;
    }

    private static int find(int i){

        while (pre[i] != i)
            i = pre[i];
        return i;
    }

    public static void join(int i, int j){
        int p1 = find(i);
        int p2 = find(j);
        if (p1 != p2){
            pre[p1] = p2;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int m = scan.nextInt();
        int f = scan.nextInt();
        init();
        for (int i = 0; i < m; i ++){
            int number = scan.nextInt();
            int n1 = scan.nextInt();
            for (int j = 1; j < number; j ++){
                int n2 = scan.nextInt();
                join(n1,n2);
                n1 = n2;
            }
        }
        int parent = find(f);
        int res = 0;
        for (int i = 0; i < n; i ++){
            if (find(i) == parent)
                res ++;
        }
        System.out.println(res);
    }
}
