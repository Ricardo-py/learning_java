package Sword_offer.offer19;

import com.alibaba.druid.sql.visitor.functions.Lcase;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    @Test
    public void run(){
        int [][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        System.out.println(printMatrix(matrix));
    }

    public ArrayList<Integer> printMatrix(int [][] matrix){
        if (matrix == null || matrix.length == 0)
            return null;
        ArrayList<Integer> res = new ArrayList();
        int top = 0;
        int right = matrix[0].length - 1;
        int left = 0;
        int bottom = matrix.length - 1;
        int count = matrix.length * matrix[0].length;
        int sum = 0;
        //dir = 0:right, dir=1 down, dir = 2 left, dir = 3,up;
        int dir = 0;
        int rows = 0, cols = 0;
        while(sum < count){
            switch (dir){
                case 0:{
                    rows = top;
                    if (cols <= right) {
                        res.add(matrix[rows][cols++]);
                        sum ++;
                    }
                    else {
                        top ++;
                        rows ++;
                        dir = 1;
                    }
                    break;
                }
                case 1:{
                    cols = right;
                    if (rows <= bottom) {
                        res.add(matrix[rows++][cols]);
                        sum ++;
                    }
                    else {
                        cols --;
                        right --;
                        dir = 2;
                    }
                    break;
                }
                case 2:{
                    rows = bottom;
                    if (cols >= left) {
                        res.add(matrix[rows][cols--]);
                        sum ++;
                    }
                    else {
                        rows --;
                        bottom --;
                        dir = 3;
                    }
                    break;
                }
                case 3:{
                    cols = left;
                    if (rows >= top) {
                        res.add(matrix[rows--][cols]);
                        sum ++;
                    }
                    else{
                        cols ++;
                        left ++;
                        dir = 0;
                    }
                }
                default:
                    break;
            }
        }
        return res;
    }
}
