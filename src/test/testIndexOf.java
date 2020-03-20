package test;

import org.junit.Test;

public class testIndexOf {

    @Test
    public void run(){
        String s1 = "flower";
        String s2 = "flow";
        String s3 = "flight";
        String[] strs = {s1,s2,s3};
        while (s2.indexOf(s1) != 0)
            s1 = s1.substring(0,s1.length() - 1);
        System.out.println(s1);
    }

    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (String s : strs){
            while (s.indexOf(prefix) != 0) prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }
}
