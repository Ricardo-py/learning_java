package Sword_offer.offer40;

public class Solution{
    public void FindNumsAppearOnce(int [] array, int num1[], int num2[]){

        int tmp = 0;
        for (int i = 0; i < array.length; i ++)
            tmp ^= array[i];
        int firstpos = firstOne(tmp);
        for (int i = 0; i < array.length; i ++){
            if (isOne(array[i],firstpos))
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }

    public int firstOne(int number){
        int index = 0;
        while (number != 0){
            number = number >> index;
            if ((number & 1) == 1)
                return index;
            index ++;
        }
        return index;
    }

    public boolean isOne(int number, int index){
        return (((number >> index) & 1) == 1);
    }
}
