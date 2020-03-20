package Sword_offer.offer54;
import org.junit.Test;

import java.util.*;

public class Solution {
    private StringBuilder str = new StringBuilder();

    @Test
    public void run(){
        char[] ch = {'g','o','o','g','l','e'};
        for (int i = 0; i < ch.length; i ++)
            Insert(ch[i]);
        System.out.println(FirstAppearingOnce());
    }
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        str.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i ++){
            if (arr.contains(str.charAt(i)))
                arr.remove((Character) str.charAt(i));
            else
                arr.add(str.charAt(i));
        }
        if (arr.size() == 0)
            return '#';
        else
            return arr.get(0);
    }
}
