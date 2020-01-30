package Sword_offer.offer13;

import org.junit.Test;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

//插入排序的思想
public class solution3 {

    @Test
    public void run(){
        int [] array = {2,4,6,1,3,5,7};
        reOrderArray(array);
    }
    public void reOrderArray(int [] array){
        for (int i = 1; i < array.length; i ++){
            if (array[i] % 2 == 1){
                int j = i - 1;
                int temp = array[i];
                while (j >= 0 && array[j] % 2 == 0){
                    array[j + 1] = array[j];
                    j --;
                }
                array[j + 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i ++)
            System.out.println(array[i]);
    }
}
