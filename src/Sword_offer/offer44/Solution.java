package Sword_offer.offer44;

import org.junit.Test;

import java.util.Stack;

public class Solution {

    @Test
    public void run(){
        String str = " ";
//        String[] splits = str.split(" ");
//        for (int i = 0; i < splits.length; i ++)
//            System.out.println(splits[i]);
        System.out.println(ReverseSentence(str));
    }
    public String ReverseSentence(String str){
        if (str == null || str.length() == 0)
            return "";
        if (str.trim().equals(""))
            return "";
        String[] splits = str.split(" ");
        Stack<String> s = new Stack<String>();
        for (int i = 0; i < splits.length; i ++)
            s.push(splits[i]);
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        while (!s.empty()){
            String ss = s.pop();
//            System.out.println(ss);
            sb.append(ss);
            sb.append(" ");
            flag = true;
        }
        if (flag)
            return sb.toString().substring(0,sb.toString().length() - 1);
        else
            return sb.toString().substring(0,sb.toString().length());
    }
}
