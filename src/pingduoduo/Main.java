package pingduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] goods = new int[num];
        for (int i = 0; i < num; i ++) {
            goods[i] = scan.nextInt();
        }
        Arrays.sort(goods);
        long result = 0;
        int i;
        for (i = goods.length - 1; i >= 2; i -=3){
            result += goods[i] + goods[i - 1];
        }
        while (i >= 0) {
            result += goods[i --];
        }
        System.out.println(result);
    }
}
