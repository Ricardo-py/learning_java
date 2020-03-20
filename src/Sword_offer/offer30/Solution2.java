package Sword_offer.offer30;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution2 {

    @Test
    public void run(){
        int[] res = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < res.length; i ++)
            arr.add(res[i]);
        quickSort(0,res.length - 1, res);
        for (int i = 0; i < res.length; i ++)
            System.out.println(res[i]);
    }

    public void quickSort(int begin, int end, int[] arr){
        if (begin >= end)
            return;
        int temp = arr[begin];
        int i = begin;
        int j = end;
        while (i < j){
            while (i < j && arr[j] >= temp)
                j--;
            if (i < j)
                arr[i] = arr[j];
            while (i < j && arr[i] <= temp)
                i ++;
            if (i < j)
                arr[j] = arr[i];
        }
        arr[i] = temp;
        quickSort(begin, i - 1, arr);
        quickSort(i + 1, end,arr);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        return null;
    }
}
