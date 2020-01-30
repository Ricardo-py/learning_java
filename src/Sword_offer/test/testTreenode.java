package Sword_offer.test;

import Sword_offer.TreeNode;
import org.junit.Test;

public class testTreenode {

    @Test
    public void run(){
        TreeNode tt = new TreeNode(11);
        insert(tt);
        System.out.println(tt);
    }

    public void insert(TreeNode t){
        TreeNode temp = new TreeNode(1);
        t.left = temp;
    }
}
