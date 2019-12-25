package leetcode.leetcode22;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private ArrayList<String> res = new ArrayList<>();
    private StringBuilder buff1 = new StringBuilder();
    private StringBuilder buff2 = new StringBuilder();
    private int number = 0;

    @Test
    public void run(){
        generateParenthesis(3);
    }
    public List<String> generateParenthesis(int n) {
        number = n;
        for (int i = 0; i < n; i ++) {
            buff1.append("(");
            buff2.append(")");
        }
        getRes(1,"",0,0,0);
        for (String s: res){
            System.out.println(s);
        }
        return null;
    }

    public void getRes(int nums, String temp, int count, int position1, int position2){
        if (nums == 2 * number + 1){
            res.add(temp);
            return ;
        }
        if (count < 0)
            return;

        if (position1 < number)
            getRes(nums + 1, temp + buff1.charAt(position1),count + 1,position1 + 1,position2);
        if (position2 < number)
            getRes(nums + 1,temp + buff2.charAt(position2),count - 1,position1,position2 + 1);
    }
}
