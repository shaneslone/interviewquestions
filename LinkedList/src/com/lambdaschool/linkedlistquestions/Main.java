package com.lambdaschool.linkedlistquestions;

public class Main {

    public static void main(String[] args) {
	Node test = new Node(1);
	test.appendToTail(1);
	test.appendToTail(2);
	test.appendToTail(4);
	test.appendToTail(5);
	test.appendToTail(5);
	test.appendToTail(2);
	test.appendToTail(10);
	RemoveDups remover = new RemoveDups();
	Node cur = test;
	while(cur != null){
        System.out.print(cur.data + " -> ");
        cur = cur.next;
    }
	remover.removeDups(test);
	cur = test;
	System.out.println();
	while(cur != null){
	    System.out.print(cur.data + " -> ");
	    cur = cur.next;
	}
    }
}
