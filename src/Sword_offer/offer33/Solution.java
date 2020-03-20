package Sword_offer.offer33;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    @Test
    public void run(){
        System.out.println(GetUglyNumber_Solution(8));
    }
    public int GetUglyNumber_Solution(int index){
        //只包含因子2,3,5的数叫做丑数
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr1.add(2);
        arr2.add(3);
        arr3.add(5);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        int pos1 = 0, pos2 = 0, pos3 = 0;
        while (res.size() < index){
            int minvalue = minValue(arr1.get(pos1),minValue(arr2.get(pos2),arr3.get(pos3)));
            if (arr1.get(pos1) == minvalue) pos1 ++;
            if (arr2.get(pos2) == minvalue) pos2 ++;
            if (arr3.get(pos3) == minvalue) pos3 ++;
            arr1.add(minvalue * 2); arr2.add(minvalue * 3); arr3.add(minvalue * 5);
            res.add(minvalue);
        }
        return res.get(res.size() - 1);
    }

    public int minValue(int a, int b){
        return a > b ? b : a;
    }
}
