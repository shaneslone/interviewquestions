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

	test.print();

	test.removeDups();

	test.print();

	test.removeNode(test.next);

	test.print();

    }
}
