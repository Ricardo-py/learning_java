package pingduoduo;

import java.util.Scanner;

//随便加一个注释
public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, m;
        n = scan.nextInt();
        m = scan.nextInt();
        long[] A = new long[n];
        for (int i = 0; i < n; i ++)
            A[i] = scan.nextLong();
        int res = 0;
        for (int i = 0; i < n; i ++) {
            long temp = 0;
            for (int j = i; j < n; j++) {
                temp = temp + A[j];
                if (temp % m == 0)
                    res ++;
            }
        }
        System.out.println(res);
    }
}
