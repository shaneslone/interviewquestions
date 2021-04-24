package com.lambdaschool.stacksandqueues;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();
        myQueue.add(15);
        myQueue.add(17);
        myQueue.add(20);

        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.peek());
    }
}