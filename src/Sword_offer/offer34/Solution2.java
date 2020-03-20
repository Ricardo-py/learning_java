package Sword_offer.offer34;

import org.junit.Test;

public class Solution2 {

    @Test
    public void run(){
        System.out.println(FirstNotRepeatingChar("sdf"));
    }

    //可以用数组再写一遍
    //思路：新建一个ArrayList，每次循环看里面是否存在这个字符，如果不存在，添加，如果
    //存在则移除，最后得到一个只出现了一次的字符数组，在原来的str当中查找
    //字符数组第一个字符所在的位置即可
    public int FirstNotRepeatingChar(String str){

        return 0;
    }
}
