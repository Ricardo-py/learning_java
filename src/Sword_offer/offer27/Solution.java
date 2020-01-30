package Sword_offer.offer27;

import org.junit.Test;

import java.util.*;

public class Solution {

    boolean[] visit = new boolean[10];
    private ArrayList<String> res = new ArrayList();
    private Set<Character> s = new HashSet<>();
    private Set<String> stemp = new LinkedHashSet<>();
    @Test
    public void run(){
        String temp = "aab";
        System.out.println(Permutation(temp));
    }
    public ArrayList<String> Permutation(String str){
        if (str == null || str.length() == 0)
            return res;
        int step = 0;
        getRes("",str, step);
        for (String stt : stemp){
            res.add(stt);
        }
        return res;
        //return null;
    }

    public void getRes(String temp, String str, int step){
        if (temp.length() == str.length()){
            stemp.add(temp);
            return ;
        }
        for (int i = 0; i < str.length(); i ++){
            if (!visit[i]) {
                visit[i] = true;
                getRes(temp + str.charAt(i), str, step + 1);
                visit[i] = false;
            }
        }
    }
}
