package Sword_offer.offer42;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    @Test
    public void run(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(FindNumbersWithSum(arr,21));
    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum){
        int mutiply = 0x3f3f3f3f;
        int posBegin = 0;
        int posEnd = array.length - 1;
        int[] res = new int[2];
        boolean flag = false;
        while (posBegin < posEnd){
            int tmp = array[posBegin] + array[posEnd];
            if (tmp == sum){
                int tmp2 = array[posBegin] * array[posEnd];
                if (tmp2 < mutiply) {
                    mutiply = tmp2;
                    res[0] = array[posBegin];
                    res[1] = array[posEnd];
                }
                flag = true;
                posBegin ++;
            }else if (tmp < sum){
                posBegin ++;
            }else
                posEnd --;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        if (!flag)
            return arr;
        arr.add(res[0]);
        arr.add(res[1]);
        return arr;
    }
}
