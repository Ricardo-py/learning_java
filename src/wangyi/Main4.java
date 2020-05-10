package wangyi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main4 {
    private static boolean[][] visit;
    private static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    private static int row;
    private static int col;
    private static int[][] map;
    static class Node{
        Node(int[] pos,int value){
            this.pos = pos;
            this.value = value;
        }
        public int[] pos;
        public int value = 0;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        col = scan.nextInt();
        int n = row;
        int m = col;
        String[] s = new String[n];
        map = new int[n][m];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++)
                map[i][j] = scan.nextInt();
        }
        visit = new boolean[n][m];
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                res[i][j] = getRes(new int[]{i,j});
                init();
            }
        }
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static void init(){
        for(int i = 0; i < row; i ++)
            for(int j = 0; j < col; j ++)
                visit[i][j] = false;
    }

    //深度优先搜索
    public static int getRes(int[] pos){
        Queue<Node> q = new LinkedList<>();
        Node n = new Node(pos,0);
        q.offer(n);
        while (!q.isEmpty()){
            Node front = q.poll();
            for (int i = 0; i < 4; i ++){
                int[] posnew = {front.pos[0] + dir[i][0],front.pos[1] + dir[i][1]};
                if (isIllegal(posnew)){
                    visit[posnew[0]][posnew[1]] = true;
                    Node node = new Node(posnew,front.value + 1);
                    if (map[posnew[0]][posnew[1]] == 0)
                        return front.value + 1;
                }
            }
        }
        return 0;
    }

    public static boolean isIllegal(int[] pos){
        if (pos[0] < 0 || pos[0] >= row)
            return false;
        if (pos[1] < 0 || pos[1] >= col)
            return false;
        if (visit[pos[0]][pos[1]] == true)
            return false;
        return true;
    }
}
