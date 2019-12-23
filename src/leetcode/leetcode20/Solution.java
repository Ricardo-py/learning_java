package leetcode.leetcode20;

import org.junit.Test;

import java.util.Stack;

public class Solution {

    @Test
    public void run(){
        System.out.println(isValid("()"));
    }
    @Test
    public void test(){
        String stemp = "123";
        for (int i = 0; i < stemp.length(); i ++){
            switch (stemp.charAt(i)){
                case '1':
                    System.out.println(1);
                    break;
                case '2':
                    System.out.println(2);
                    break;
                default:
                    System.out.println("I don't know!");
                    break;
            }
        }

    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++){
            switch (s.charAt(i)){
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case '}':
                    if (stack.empty())
                        return false;
                    char ch = stack.pop();
                    if (ch != '{')
                        return false;
                    break;
                case ']':
                    if (stack.empty())
                        return false;
                    char ch1 = stack.pop();
                    if (ch1 != '[')
                        return false;
                    break;
                case ')':
                    if (stack.empty())
                        return false;
                    char ch2 = stack.pop();
                    if (ch2 != '(')
                        return false;
                    break;
                default:
                    break;
            }
           /* if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (stack.isEmpty())
                    return false;
                char ch = stack.pop();
                if (ch == '(' && s.charAt(i) == ')')
                    continue;
                else if (ch == '[' && s.charAt(i) == ']')
                    continue;
                else if (ch == '{' && s.charAt(i) == '}')
                    continue;
                else
                    return false;
            }*/
        }
        if (!stack.empty())
            return false;
        return true;
    }
}
