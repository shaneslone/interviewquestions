package com.lambdaschool.stacksandqueues;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);
        myStack.push(4);
        myStack.push(10);
        myStack.push(1);
        myStack.push(11);
        myStack.push(100);
        myStack.push(-12);
        myStack.push(0);
        myStack.push(10);
        myStack.push(5);

        sortStack(myStack);

        int count = 1;

        while(!myStack.isEmpty()){
            System.out.println(count + ". " + myStack.pop());
            count++;
        }


    }

    private static void sortStack(Stack<Integer> s){
        Stack<Integer> temp = new Stack<>();
        temp.push(s.pop());

        while(!s.isEmpty()){
            if(s.peek() >= temp.peek()){
                temp.push(s.pop());
            } else {
                int cur = s.pop();
                while(!temp.isEmpty() && cur < temp.peek()){
                    s.push(temp.pop());
                }
                temp.push(cur);
            }
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
}