package JD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static class node{
        int begin;
        int end;
        public node(int b,int e){this.begin = b; this.end = e;}
    }

    private static int[] pre;


    public static void main(String[] args){
        ArrayList<node> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pre = new int[n];
        for (int i = 0; i < n; i ++){
            pre[i] = i;
            int begin = scan.nextInt();
            int end = scan.nextInt();
            node temp = new node(begin,end);
            arr.add(temp);
        }
        for (int i = 0; i < n; i ++)
            for (int j = 0; j < i; j ++)
                if (isIllegal(arr.get(i),arr.get(j)))
                    Join(i,j);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i ++) {
            int temp = Find(i);
            if (map.get(temp) == null)
                map.put(temp, 1);
            else
                map.put(temp, map.get(temp) + 1);
        }

        int maxvalue = Integer.MIN_VALUE;
        for (Integer m : map.keySet()){
            if (maxvalue < map.get(m))
                maxvalue = map.get(m);
        }
        System.out.println(maxvalue);
    }

    public static void Join(int i, int j){
        int x = Find(i);
        int y = Find(j);
        if (x != y)
            pre[x] = y;
    }

    public static int Find(int i){
        while (i != pre[i])
            i = pre[i];
        return i;
    }

    //判断是否相交
    public static boolean isIllegal(node n1, node n2){
        if (n1.begin <= n2.begin && n1.end >= n2.begin)
            return true;
        else if (n1.begin >= n2.begin && n1.begin <= n2.end)
            return true;
        return false;
    }
}
