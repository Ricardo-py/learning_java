package leetcode.leetcode345;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;

        Set<Character> set = new HashSet();
        StringBuilder sb = new StringBuilder(s);
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        while (left < right){
            while (left < right && !set.contains(s.charAt(left)))
                left ++;
            while (left < right && !set.contains(s.charAt(right)))
                right --;
            char temp = s.charAt(left);
            sb.setCharAt(left,s.charAt(right));
            sb.setCharAt(right,temp);
            left ++;
            right --;
        }
        return sb.toString();
    }
}
