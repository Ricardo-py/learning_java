package Sword_offer.offer53;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        char[] ch = {'1','2','e','+','4','.','3'};
        System.out.println(isNumeric(ch));
    }

    public boolean isNumeric(char[] str){
        if (str == null || str.length == 0)
            return false;
        int index = str.length;
        for (int i = 0; i < str.length; i ++)
            if (str[i] == 'e' || str[i] == 'E'){
                index = i;
                break;
            }
        if (index == str.length)
            return isLeftNumber(str,0,index-1);
        else
            return isLeftNumber(str,0,index - 1) && isIntNumber(str,index + 1,str.length);
    }

    public boolean isIntNumber(char[] str,int b, int d){
        if (str == null || str.length == 0 || b >= str.length)
            return false;
        int begin = b;
        if (str[b] == '+' || str[b] == '-'){
            begin = b + 1;
        }
        for (int i = begin; i < d; i ++){
            if (str[i] <= '9' && str[i] >= '0')
                continue;
            else
                return false;
        }
        return true;
    }

    public boolean isLeftNumber(char[] str, int b, int d){
        if (str == null || str.length == 0 || b >= str.length)
            return true;
        int begin = b, dotnumber = 0;
        if (str[b] == '+' || str[b] == '-'){
            begin = b + 1;
        }
        for (int i = begin; i < d; i ++){
            if (str[i] <= '9' && str[i] >= '0')
                continue;
            else if (str[i] == '.'){
                dotnumber ++;
                continue;
            }else
                return false;
        }
        if (dotnumber > 1)
            return false;
        return true;
    }
}
