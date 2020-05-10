package Tencent;

import java.util.Scanner;

public class Main2 {

    static class node{
        public long x;
        public long y;
        public node(long x, long y){this.x = x; this.y = y;}
    }

    public static double distance(node n1, node n2){
        return Math.sqrt(Math.pow(n1.x - n2.x,2) + Math.pow(n1.y - n2.y, 2));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n -- > 0){
            int m = scan.nextInt();
            node[] n1 = new node[m];
            node[] n2 = new node[m];
            for (int i = 0; i < m; i ++)
                n1[i] = new node(scan.nextLong(),scan.nextLong());
            for (int i = 0; i < m; i ++)
                n2[i] = new node(scan.nextLong(), scan.nextLong());

//            Arrays.sort(n1, new Comparator<node>() {
//                @Override
//                public int compare(node o1, node o2) {
//                    if (o1.x > o2.x)
//                        return 1;
//                    return -1;
//                }
//            });
//            Arrays.sort(n2, new Comparator<node>() {
//                @Override
//                public int compare(node o1, node o2) {
//                    if (o1.x > o2.x)
//                        return 1;
//                    return -1;
//                }
//            });

            double res = Double.MAX_VALUE;
            for (int i = 0; i < m; i ++){
                for (int j = 0; j < m; j ++) {
                    double temp = 0.0;
                    if ((temp = distance(n1[i], n2[j])) < res)
                        res = temp;
                }
            }
            System.out.println(String.format("%.3f",res));
        }
    }
}
