package Sword_offer.test;

import org.junit.Test;

public class testArray {
    @Test
    public void run(){
        int [] arr = {1,2,3};
        change(arr);
        for (int i = 0; i < arr.length; i ++)
            System.out.println(arr[i]);
    }

    public void change(int [] arr){
        arr[0] = 2;
    }

}
