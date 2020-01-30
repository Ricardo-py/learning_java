package Sword_offer.offer23;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        int [] sequence = {7,4,6,5};
        System.out.println(VerifySquenceOfBST(sequence));
    }
    public boolean VerifySquenceOfBST(int [] sequence){
        if (sequence == null || sequence.length == 0) return false;
        return isTree(sequence,0,sequence.length - 1);
    }

    public boolean isTree(int [] arr, int start, int end){
        if (start >= end)
            return true;
        int i = start;
        while (i < end){
            if (arr[i] > arr[end]) break;
        }
        for (int j = i; j < end; j ++)
            if (arr[j] < arr[end]) return false;
        return isTree(arr,start, i) && isTree(arr,i + 1, end - 1);
    }

}
