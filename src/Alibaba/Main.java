package Alibaba;

import java.util.Scanner;

public class Main {

    private static int[][] numbers = null;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        numbers = new int[3][n];
        for (int i = 0; i < 3; i ++){
            for (int j = 0;j < n; j ++)
                numbers[i][j] = scan.nextInt();
        }

        for (int j = 0; j < n; j ++){
            for (int i = 0; i < 2; i ++){
                int p = i;
                for (int k = i + 1; k < 3; k ++)
                    if (numbers[k][j] < numbers[p][j])
                        p = k;
                int temp = numbers[i][j];
                numbers[i][j] = numbers[p][j];
                numbers[p][j] = temp;
            }
        }

//        for (int i = 0; i < 3; i ++){
//            for (int j  = 0; j < n; j ++)
//                System.out.print(numbers[i][j] + " ");
//            System.out.println();
//        }
        Integer a = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i ++)
            a = Math.min(a,solve(0,n,0,numbers[i][0]));
        System.out.println(a);
    }
    public static int solve(int step, int n, int result, int num){
        if (step == n - 1)
            return result;
        int i = 0;
        while (i < 3 && step + 1 < n && numbers[i][step + 1] <= num)
            i ++ ;
        if (i > 0)
            i --;
        return solve(step + 1, n, result + Math.abs(num - numbers[i][step + 1]), numbers[i][step + 1]);
    }
}
