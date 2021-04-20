package com.lambdaschool.linkedlistquestions;

import java.util.HashSet;
import java.util.Set;

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

	removeDupes((test));

	test.print();

    }

	public static void removeDupes(Node head){
		Set<Integer> seen = new HashSet<>();
		Node prev = head;
		Node cur = head;
		while (cur != null){
			Node next = cur.next;
			if(seen.contains(cur.data)){
				prev.next = next;
			} else {
				seen.add(cur.data);
				prev = cur;
			}
			cur = next;
		}
	}
}
