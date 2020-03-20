package Sword_offer.offer51;

public class Solution {
    public int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];
        B[0] = 1;
        for (int i = 1; i < length; i ++){
            B[i] = B[i - 1] * A[i - 1];
        }
        int tmp = 1;
        for (int i = length - 2; i >= 0; i --){
            tmp = tmp * A[i + 1];
            B[i] *= tmp;
        }
        return B;
    }
}
