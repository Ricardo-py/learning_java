package Sword_offer.offer3;


import Sword_offer.ListNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private ArrayList<Integer> listresult = new ArrayList<Integer>();
    public List<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null)
            return listresult;
        if (listNode.next != null)
            printListFromTailToHead(listNode.next);
        listresult.add(listNode.val);
        return listresult;
    }
}
