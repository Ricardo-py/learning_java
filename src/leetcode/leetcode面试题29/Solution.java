package leetcode.leetcode面试题29;

import org.junit.Test;

public class Solution {

    @Test
    public void run(){

        int[][] matrix= {{2,5,8},{4,0,-1}};
        int[] res = spiralOrder(matrix);
        for (int i = 0; i < res.length; i ++)
            System.out.println(res[i]);
    }

    public int[] spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0)
            return new int[0];
        int left = 0, right = matrix[0].length - 1,top = 0,bottom = matrix.length - 1;
        int k = 0;
        int[] res = new int[(right + 1) * (bottom + 1)];


        while(true){
            System.out.println(k);
            for (int i = left; i <= right; i ++)
                res[k ++] = matrix[top][i];
            if (++ top > bottom)
                break;

            for(int i = top; i <= bottom; i ++)
                res[k ++] = matrix[i][right];
            if(-- right < left)
                break;

            for (int i = right; i >= left; i --)
                res[k ++] = matrix[bottom][i];
            if (-- bottom > top)
                break;

            for (int i = bottom; i >= top; i --)
                res[k ++] = matrix[i][left];
            if (++ left > right)
                break;
        }
        return res;
    }
}
