package Sword_offer.offer65;

import com.alibaba.druid.sql.visitor.functions.Char;
import org.junit.Test;

public class Solution {
    private static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    private int rows = 0, cols = 0;
    private boolean[][] visit;
    private int length = 0;
    private Character[][] map;

    @Test
    public void run(){
        String s = "ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS";
        String ss = "SLHECCEIDEJFGGFIE";
        //Character[] martix = new Character[40];
        //Character[] str = new Character[ss.length()];
        char[] martix = new char[40];
        char[] str = new char[ss.length()];
        for (int i = 0; i < s.length(); i ++)
            martix[i] = s.charAt(i);
        for (int i = 0; i < ss.length(); i ++)
            str[i] = ss.charAt(i);
        System.out.println(hasPath(martix,5,8,str));
    }
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        this.rows = rows;
        this.cols = cols;
        visit = new boolean[rows][cols];
        for (int i = 0; i < rows; i ++)
            for (int j = 0; j < cols; j ++)
                visit[i][j] = false;
        length = str.length;
        map = new Character[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i ++)
            for (int j = 0; j < cols; j ++)
                map[i][j] = matrix[k ++];
        for (int i = 0; i < rows; i ++)
            for (int j = 0; j < cols; j ++) {
                visit[i][j] = true;
                if (getRes(0, map[i][j], i, j, str))
                    return true;
                visit[i][j] = false;
            }
        return false;
    }

    public boolean getRes(int k, char ch, int x, int y, char[] str){
        if (str[k] != ch)
            return false;
        if (str[k] == ch && k == length - 1)
            return true;
        for (int i = 0; i < 4; i ++){
            if (x + dir[i][0] < rows && x + dir[i][0] >= 0 && y + dir[i][1] < cols && y + dir[i][1] >= 0){
                int xnew = x + dir[i][0];
                int ynew = y + dir[i][1];
                if (!visit[xnew][ynew]){
                    visit[xnew][ynew] = true;
                    if(getRes(k + 1, map[xnew][ynew],xnew, ynew,str))
                        return true;
                    visit[xnew][ynew] = false;
                }
            }
        }
        return false;
    }
}
