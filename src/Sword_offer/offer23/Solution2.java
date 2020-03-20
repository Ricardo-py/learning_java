package Sword_offer.offer23;

import org.junit.Test;

public class Solution2 {

    @Test
    public void run(){
        int [] sequence = {1,3,2, 5,9,8,4, 11, 14, 13,  20, 18, 22, 17, 10};
        System.out.println(VerifySquenceOfBST(sequence));
    }

    public boolean VerifySquenceOfBST(int [] sequence){
        if (sequence == null || sequence.length == 0)
            return false;
        return isIllegal(sequence,0,sequence.length - 1);
    }

    public boolean isIllegal(int[] arr, int start, int end){
        if (start >= end)
            return true ;
        int mid = 0;
        for (mid = start; mid < end; mid ++)
            if (arr[mid] > arr[end])
                break;
        for(int i = mid; i < end; i ++)
            if (arr[i] < arr[end])
                return false;
        return isIllegal(arr,start,mid - 1) && isIllegal(arr,mid,end - 1);
    }
}
