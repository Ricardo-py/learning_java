package pingduoduo;

import java.util.*;


public class Main3 {
    static class node{
        public int num;
        public ArrayList<Integer> pos;
        public node(int num, ArrayList<Integer> pos){
            this.num = num;
            this.pos = pos;
        }
    }
    public static void main(String[] args){
        int N,K;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        K = scan.nextInt();
        String numbers = scan.next();
        Map<Character,node> mp = new LinkedHashMap<>();
        char[] chs = numbers.toCharArray();
        for (int i = 0; i < chs.length; i ++)
            if(mp.get(chs[i]) == null){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                mp.put(chs[i], new node(1,temp));
            }else{
                node n = mp.get(chs[i]);
                n.num ++;
                n.pos.add(i);
            }

        int result = Integer.MAX_VALUE;
        int resNumber = 0,i = 1;
        String res = null;
        for (Character ch : mp.keySet()){
            int tempK = K - mp.get(ch).num;
            StringBuilder sb = new StringBuilder(numbers);
            int j = 0;
            for(Character ch2 : mp.keySet()){
                if (tempK <= 0)
                    break;
                if (j ++ >= i){
                    int t = mp.get(ch2).num;
                    ArrayList<Integer> arr = mp.get(ch2).pos;
                    if (tempK - t >= 0){
                        resNumber += resNumber + Math.abs((ch - ch2) * t);
                        tempK -= t;
                        for (int k = arr.size() - 1; k >= 0; k --) {
                            sb.setCharAt(arr.get(k), ch);
                        }
                    }
                    else if (tempK - t < 0){
                        for (int k = arr.size() - 1; k >= 0 && tempK > 0;k --) {
                            resNumber += Math.abs(ch - ch2);
                            sb.setCharAt(arr.get(k), ch);
                            tempK --;
                        }
                    }
                }
            }
            if (result > resNumber){
                result = resNumber;
                res = sb.toString();
            }
            i ++;
        }
        System.out.println(result);
        System.out.println(res);
    }
}
