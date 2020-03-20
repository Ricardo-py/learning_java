package leetcode;

import java.util.*;


public class test{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList();
        int result = 0;
        int res = 1;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int r[] = new int[num];
        int[] numbers = new int[num];
        r[0] = 1;
        int before = scan.nextInt();
        numbers[0] = before;
        int i = 1;
        for (i = 1; i < num; i ++){
            int temp = scan.nextInt();
            numbers[i] = temp;
            if (temp <= before){
                int j = i;
                while (j >= 1){
                    if (numbers[j] > numbers[j - 1])
                        r[j] = res;
                    j --;
                }
                res = 1;
                arr.add(i);
            }
            else{
                res ++;
                if (res > result)
                    result = res;
            }
        }
        int j = i - 1;
        while (j >= 1){
            if (numbers[j] > numbers[j - 1])
                r[j] = res;
            j --;
        }
        result = 0;
        for(int m : arr){
            if (m >= 1 && m < num - 1){
                if (numbers[m - 1] < numbers[m + 1]){
                    result = Math.max(result,r[m - 1] + r[m + 1]);
                }else{
                    result = Math.max(result, Math.max(r[m - 1],r[m + 1]) - 1);
                }
            }
        }
        System.out.println(result);
    }

}