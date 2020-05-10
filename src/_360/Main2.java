package _360;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] ddata = new int[n];
        for (int i = 0; i < n; i ++)
            ddata[i] = scan.nextInt();
        int number = ddata[0];
        int i = 1;
        int result = 0;
        int count = 0;
        int sum = 0;
        while(i < n && result < m){
            if (number > ddata[i])
                result ++;
            else {
                number = ddata[i];
                sum += result + 1;
            }
            i ++;
            count ++;
        }
        System.out.println(sum);
    }
}
