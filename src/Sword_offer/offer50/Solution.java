package Sword_offer.offer50;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean duplicate(int numbers[], int length, int [] duplication){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i ++){
            if (map.get(numbers[i]) == null){
                map.put(numbers[i],1);
            }else
                map.put(numbers[i],map.get(numbers[i]) + 1);
        }
        for (int s: map.keySet()){
            if (map.get(s) > 1) {
                duplication[0] = s;
                return true;
            }
        }
        return false;
    }
}
