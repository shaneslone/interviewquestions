package com.lambdaschool.linkedlistquestions;

import java.util.HashSet;
import java.util.Set;

import static com.lambdaschool.linkedlistquestions.Node.removeNode;

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
		Node cur = head;
		while (cur != null){
			if(seen.contains(cur.data)){
				removeNode(cur);
			} else {
				seen.add(cur.data);
				cur = cur.next;
			}
		}
	}


}
