package com.lambdaschool.stacksandqueues;

public class Main {
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Nasus"));
        animals.enqueue(new Cat("Nidalee"));
        animals.enqueue(new Dog("Warwick"));
        animals.enqueue(new Cat("Rengar"));

        System.out.println(animals.dequeueAny().name);
        System.out.println(animals.dequeueCat().name);
        System.out.println(animals.dequeueCat().name);
        System.out.println(animals.dequeueDog().name);
    }
}