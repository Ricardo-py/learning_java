package Sword_offer.offer37;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        int[] array = {1,2,2,2,2,4,5};
        GetNumberOfK(array,2);
    }

    public int GetNumberOfK(int [] array, int k){
        return search(array,k + 0.5) - search(array,k - 0.5);
    }

    public int search(int [] array, double num){
        int begin = 0, end = array.length - 1;
        while (begin <= end){
            int mid = (end - begin) / 2 + begin;
            if (array[mid] < num)
                begin = mid + 1;
            else if (array[mid] > num)
                end = mid - 1;
        }
        return begin;
    }
}
