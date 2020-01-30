package Sword_offer.offer13;

//普通的思想
public class Solution {
    public void reOrderArray(int[] array){
        int[] even = new int[array.length];
        int[] odd = new int[array.length];
        int k = 0,j = 0;
        for (int i = 0; i < array.length; i ++)
            if (array[i] % 2 == 0)
                even[k ++] = array[i];
            else
                odd[j ++] = array[i];
        for (int i = 0; i < array.length; i ++)
            if (i < j)
                array[i] = odd[i];
            else
                array[i] = even[i - j];
    }
}
