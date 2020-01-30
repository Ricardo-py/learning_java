package Sword_offer.offer29;

import org.junit.Test;

import java.util.ArrayList;



public class Solution {

    @Test
    public void run(){
        int [] arr = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(arr,8));
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        maxHeap(input);
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length)
            return res;
        int length = input.length;
        for (int i = 1; i <= k; i ++){
            res.add(input[0]);
            input[0] = input[length - 1];
            maxHeapNode(input,0,--length);
        }
        return res;
    }

    public void maxHeap(int[] arr){
        for (int i = arr.length / 2 - 1; i >= 0; i --)
            maxHeapNode(arr,i,arr.length);
    }
    public void maxHeapNode(int[] arr, int pos, int length){
        int root = pos;
        while (root  < length) {
            int left = root * 2 + 1;
            int right = root * 2 + 2;
            int minpos = root;
            if (left < length && arr[minpos] > arr[left])
                minpos = left;
            if (right < length && arr[minpos] > arr[right])
                minpos = right;
            if (minpos != root) {
                int temp = arr[minpos];
                arr[minpos] = arr[root];
                arr[root] = temp;
                root = minpos;
            }else return;
        }
    }
}
