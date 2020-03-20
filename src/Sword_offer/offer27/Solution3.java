package Sword_offer.offer27;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution3 {

    private ArrayList<String> res = new ArrayList<>();

    @Test
    public void run(){
        String str = "ab";
        System.out.println(Permutation(str));
    }

    public ArrayList<String> Permutation(String str) {
        if (str == null)
            return null;
        getRes(0,str.length() - 1,str);
        Collections.sort(res);
        return res;
    }

    public String swap(StringBuilder str, int pos1, int pos2){
        char chtemp = str.charAt(pos1);
        str.setCharAt(pos1,str.charAt(pos2));
        str.setCharAt(pos2,chtemp);
        return str.toString();
    }

    public boolean isContinue(String str, int begin , int pos){
        if (str == null || str.length() == 0)
            return true;
        for (int i = begin; i < pos; i ++)
            if (str.charAt(i) == str.charAt(pos))
                return true;
        return false;
    }

    public void getRes(int begin, int end, String source){
        if (begin > end){
            res.add(source);
            return ;
        }
        for (int i = begin; i <= end; i ++){
            if (isContinue(source,begin,i))
                continue;
            source = swap(new StringBuilder(source),begin,i);
            getRes(begin + 1,end,source);
            source = swap(new StringBuilder(source),begin,i);
        }
    }
}
