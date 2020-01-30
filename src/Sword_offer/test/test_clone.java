package Sword_offer.test;

import java.util.ArrayList;

public class test_clone {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        res.add((ArrayList<Integer>) arr.clone());
        arr.add(3);
        res.add((ArrayList<Integer>) arr.clone());
        System.out.println(res);
        push(arr,4);
        System.out.println(arr);
    }

    public static void push(ArrayList<Integer> arr,int num){
        arr.add(num);
    }
}
