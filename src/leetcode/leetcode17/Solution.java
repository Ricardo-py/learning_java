package leetcode.leetcode17;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    @Test
    public void main(){
        String s = "";
        System.out.println(letterCombinations(s));
    }
    private List<String> result = new ArrayList<>();
    String[] mapchar = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",""};
    int[] nums = null;

    public List<String> letterCombinations(String digits){
        if (digits.equals(""))
            return result;
        nums = new int[digits.length() + 1];
        for (int i = 0; i < digits.length(); i ++)
            nums[i] = digits.charAt(i) - '0';
        getresult(nums[0],"",0);
        return result;
    }

    public void getresult(int k, String temp, int length){
        if (length == nums.length - 1){
            result.add(temp);
            return;
        }
        for (int i = 0; i < mapchar[k].length(); i ++){
            getresult(nums[length + 1],temp + mapchar[k].charAt(i),length + 1);
        }
    }

}
