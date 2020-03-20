package leetcode.hot6;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){
        String s = "AB";
        System.out.println(convert(s,1));
    }
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        if (s == null || s.length() == 0)
            return "";
        StringBuilder[] res = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i ++)
            res[i] = new StringBuilder("");

        StringBuilder sb = new StringBuilder("");
        int flag = 1;
        int i = 1, j = 0;
        res[0].append(s.charAt(0));
        while (i < s.length()){
            j += flag;
            res[j].append(s.charAt(i));
            if (i % (numRows - 1) == 0)
                flag = flag * (-1);
            i ++;
        }
        for (i = 0; i < numRows; i ++)
            sb.append(res[i].toString());

        return sb.toString();
    }
}
