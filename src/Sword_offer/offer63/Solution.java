package Sword_offer.offer63;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

    private ArrayList<Integer> arr = new ArrayList<>();

    @Test
    public void run(){
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        System.out.println(GetMedian());
    }

    public void Insert(Integer num){
        arr.add(num);
    }

    public Double GetMedian(){
        if (arr == null || arr.size() == 0)
            return null;
        int size = arr.size();
        Collections.sort(arr);
        if (size % 2 == 0)
            return (1.0) * (arr.get(size / 2) + arr.get(size / 2 - 1)) / 2;
        else
            return 1.0 * arr.get(size / 2);
    }
    class SortByKey implements Comparator<Object>{

        @Override
        public int compare(Object o1, Object o2) {
            if ((Integer)o1 < (Integer)o2)
                return 0;
            else
                return 1;
        }
    }
}
