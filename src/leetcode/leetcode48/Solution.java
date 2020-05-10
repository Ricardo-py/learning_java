package leetcode.leetcode48;

class Solution {
    public void rotate(int[][] matrix) {

        //先转置
        int n = matrix[0].length;
        for (int i = 0; i < n; i ++)
            for (int j = i; j < n; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        //翻转
        for (int i = 0; i < n; i ++)
            for (int j = 0; j < n / 2; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
    }
}
