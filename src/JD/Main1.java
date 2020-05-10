package JD;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        HashMap<Integer,Integer> map = new HashMap();
        while (T -- != 0) {
            for (int i = 0; i < 12; i++) {
                int m = scan.nextInt();
                if (map.get(m) == null)
                    map.put(m, 1);
                else
                    map.put(m, map.get(m) + 1);
            }
            boolean flag = true;
            for (Integer i : map.keySet()) {
                if (map.get(i) % 4 != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("POSSIBLE");
            else
                System.out.println("IMPOSSIBLE");
            map.clear();
        }
    }
}
