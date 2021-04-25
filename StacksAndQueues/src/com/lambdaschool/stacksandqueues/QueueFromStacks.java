package com.lambdaschool.stacksandqueues;

public class QueueFromStacks<T> {
    Stack<T> stackNewest, stackOldest;

    public QueueFromStacks() {
        stackNewest = new Stack<T>();
        stackOldest = new Stack<T>();
    }

   public void add(T value){
        stackNewest.push(value);
   }

   private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
   }

   public T peek(){
        shiftStacks();
        return stackOldest.peek();
   }

   public T remove(){
        shiftStacks();
        return stackOldest.pop();
   }
}
