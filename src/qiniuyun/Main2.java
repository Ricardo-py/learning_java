package qiniuyun;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();


        while (T -- > 0){
            Stack<Character> s = new Stack();
            String str = scan.next();
            char[] chars = str.toCharArray();
            char top = '#';
            char temp = '/';
            for (int i = 0; i < chars.length; i ++){
                if (chars[i] != top) {
                    if (chars[i] == temp)
                        continue;
                    top = chars[i];
                    s.push(chars[i]);
                }else{
                    if (!s.isEmpty())
                        temp = s.pop();
                    else
                        temp = '/';
                    if (!s.isEmpty())
                        top = s.peek();
                    else
                        top = '#';
                }
            }
            if (s.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
            s.clear();
        }
    }
}
