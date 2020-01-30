package Sword_offer.offer7;

public class Solution {
    public int Fibonacci(int n){
        if (n == 0)
            return 0;
        int[] fibonacci = new int[39];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 39; i ++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        return fibonacci[n - 1];
    }
}
