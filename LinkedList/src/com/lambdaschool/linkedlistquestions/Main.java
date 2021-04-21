package com.lambdaschool.linkedlistquestions;

import java.util.HashSet;
import java.util.Set;

import static com.lambdaschool.linkedlistquestions.Node.removeNode;

public class Main {

    public static void main(String[] args) {
	Node n1 = new Node(9);
	n1.appendToTail(9);
	n1.appendToTail(9);

	Node n2 = new Node(9);
	n2.appendToTail(9);

	n1.print();
	n2.print();

	Node sum = sumList(n1, n2);
	sum.print();

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

	public static Node sumList(Node a, Node b){
    	int cur = a.data + b.data;
    	Node sum = new Node(cur % 10);
    	int carry = cur / 10;
    	a = a.next;
    	b = b.next;
		Node currentNode = sum;
    	while(a != null || b != null || carry != 0){
    		cur = 0;
    		cur += carry;
    		if (a != null){
    			cur += a.data;
			}
    		if (b != null){
    			cur += b.data;
			}
    		currentNode.next = new Node(cur % 10);
    		carry = cur / 10;
    		if(a != null){
    			a = a.next;
			}
    		if(b != null){
    			b = b.next;
			}
    		currentNode = currentNode.next;
		}
    	return sum;
	}


}
