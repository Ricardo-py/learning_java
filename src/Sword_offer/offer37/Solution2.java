package Sword_offer.offer37;

import org.junit.Test;

public class Solution2 {

    @Test
    public void run(){
        int[] array = {1,1,1,2,2,2,3,3,3,3,3,5,5,5,5,5};
        System.out.println(GetNumberOfK(array,3));
    }

    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0)
            return 0;
        return getRes(array,k,false) - getRes(array,k,true);
    }

    public int getRes(int [] array, int k, boolean flag){
        int begin = 0, end = array.length - 1;
        int mid = (begin + end) / 2;
        while(begin <= end){
            mid = (begin + end) / 2;
            if (array[mid] < k)
                begin = mid + 1;
            else if (array[mid] > k)
                end = mid - 1;
            else{
                if (flag){
                    if (mid == begin)
                        return mid;
                    else if (array[mid - 1] == k)
                        end = mid - 1;
                    else
                        return mid;
                }else{
                    if (mid == end)
                        return mid;
                    else if (array[mid + 1] == k)
                        begin = mid + 1;
                    else
                        return mid;
                }
            }
        }
        return 0;
    }
}
