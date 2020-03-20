package Sword_offer.offer34;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    @Test
    public void run(){
        String str = "google";
        System.out.println(FirstNotRepeatingChar(str));
    }
    public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i ++){
            if (map.get(str.charAt(i)) != null){
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        char res_ch = '0';
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                res_ch = ch;
                break;
            }
        }
        System.out.println(res_ch);
        if (res_ch == '0')
            return -1;
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == res_ch)
                return i;
        }
        return -1;
    }
}
