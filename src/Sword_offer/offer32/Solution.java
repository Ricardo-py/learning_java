package Sword_offer.offer32;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution{

    @Test
    public void run(){
        int [] numbers = {3,32,321};
        System.out.println(PrintMinNumber(numbers));
    }
    public String PrintMinNumber(int [] numbers) {
        String[] Numbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i ++)
            Numbers[i] = String.valueOf(numbers[i]);
        //Numbers = Arrays.copyOf(new String[]{String.valueOf(numbers)},numbers.length+ 1);
        String str = "";
        for (int i = 0; i < Numbers.length; i++)
            for (int j = i + 1; j < Numbers.length; j++){
                String a = Numbers[i] + "" + Numbers[j];
                String b = Numbers[j] + "" + Numbers[i];
                if (a.compareTo(b) > 0){
                    String temp = Numbers[i];
                    Numbers[i] = Numbers[j];
                    Numbers[j] = temp;
                }
            }
        for (int i = 0; i < Numbers.length; i ++)
            str=str + Numbers[i];
        return str;
    }
}
