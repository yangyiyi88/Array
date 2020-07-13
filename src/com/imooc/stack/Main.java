package com.imooc.stack;

public class Main {
    public static void main(String[] args) {
        com.imooc.stack.ArrayStack<Integer> stack = new com.imooc.stack.ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
