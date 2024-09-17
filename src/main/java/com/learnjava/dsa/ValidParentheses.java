package com.learnjava.dsa;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String str = "(])";
        System.out.println(validParentheses.isValid(str));
    }

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
                if (stack.empty()){
                    return Boolean.FALSE;
                }
                if (str.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (str.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (str.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }
            }
        }
        if (stack.empty()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public boolean isValid2(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }else if(s.charAt(i)=='{'){
                st.push('}');
            }else if(s.charAt(i)=='['){
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=s.charAt(i)){
                return false;
            }
        }
        return st.isEmpty();
    }
}
