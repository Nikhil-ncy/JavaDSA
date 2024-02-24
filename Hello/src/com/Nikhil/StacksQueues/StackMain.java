package com.Nikhil.StacksQueues;

public class StackMain {
    public static void main(String[] args) throws Exception{

        DynamicStack stack = new DynamicStack(4);

        stack.push(4);
        stack.push(3);
        stack.push(7);
        stack.push(89);
        stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
