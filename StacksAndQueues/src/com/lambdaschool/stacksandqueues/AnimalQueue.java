package com.lambdaschool.stacksandqueues;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    private int order = 0;

    public void enqueue(Animal a){
        a.setOrder(order);
        order++;

        if(a instanceof Dog){
            dogs.add((Dog) a);
        } else {
            cats.add((Cat) a);
        }
    }

    public Animal dequeueAny(){
        if(dogs.size() == 0){
            return dequeueCat();
        } else if (cats.size() == 0){
            return dequeueDog();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        if(dog.isOlderThan(cat)){
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog dequeueDog(){
        return dogs.poll();
    }

    public Cat dequeueCat(){
        return cats.poll();
    }
}
