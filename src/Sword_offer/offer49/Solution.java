package Sword_offer.offer49;

import org.junit.Test;

public class Solution {
    @Test
    public void run(){
        String str = " +1a3 ";
        String b = "-123";
        System.out.println(StrToInt(b));
    }
    public int StrToInt(String str){

        if (!islegal(str))
            return 0;
        boolean flag = true;
        if (str.charAt(0) == '-')
            flag = false;
        if (str.charAt(0) == '-' || str.charAt(0) == '+')
            str = str.substring(1, str.length());

        int res = 0, length = str.length();
        int power = 1;
        for (int i = length - 1; i >= 0; i --){
            res += (str.charAt(i) - '0') * power;
            power *= 10;
        }
        if (!flag)
            return -1 * res;
        return res;
    }


    public boolean islegal(String str){
        if (str == null || str.length() == 0)
            return false;
        str = str.trim();
        if (str.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-'))
            return false;
        for (int i = 0; i < str.length(); i ++){
            if (i == 0){
                if ((str.charAt(0) == '+' || str.charAt(0) == '-'))
                    continue;
                else if (str.charAt(0) > '0' && str.charAt(0) < '9')
                    continue;
                else
                    return false;
            }else {
                if (str.charAt(i) > '9' || str.charAt(i) < '0')
                    return false;
            }
        }
        String minvalue = "-2147483648";
        String maxvalue1 = "+2147483647";
        String maxvalue2 = "2147483647";
        if (str.charAt(0) == '-'){
            if (str.length() < minvalue.length())
                return true;
            for (int i = 1; i < str.length(); i ++)
                if (minvalue.charAt(i) < str.charAt(i))
                    return false;
        }else if (str.charAt(0) == '+'){
            if (str.length() < maxvalue1.length())
                return true;
            for (int i = 1; i < str.length(); i ++)
                if (maxvalue1.charAt(i) < str.charAt(i))
                    return false;
        }else{
            if (str.length() < maxvalue2.length())
                return true;
            for (int i = 0; i < str.length(); i ++)
                if (maxvalue2.charAt(i) < str.charAt(i))
                    return false;
        }
        return true;
    }
}
