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

//	test.print();
//
//	removeDupes((test));
//
//	test.print();

		Node n = kthToLast(test, 3);
		System.out.println(n.data);

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

	public static Node kthToLast(Node head, int k){
    	Node fast = head;
    	Node target = head;

    	for(int i = 0; i < k; i++){
    		if(fast.next == null){
    			return null;
			}
    		fast = fast.next;
		}
    	while(fast != null){
    		fast = fast.next;
    		target = target.next;
		}
    	return target;
	}


}
