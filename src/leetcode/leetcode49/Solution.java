package leetcode.leetcode49;

import org.junit.Test;

import java.util.*;

public class Solution {

    @Test
    public void run(){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        String[] temp = new String[strs.length];
        for (int i = 0; i < strs.length; i ++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            temp[i] = String.valueOf(ch);
        }
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i ++){
            if (map.containsKey(temp[i]))
                map.get(temp[i]).add(strs[i]);
            else {
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                map.put(temp[i],arr);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}
