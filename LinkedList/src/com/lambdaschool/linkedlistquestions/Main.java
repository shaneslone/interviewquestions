package com.lambdaschool.linkedlistquestions;

import java.util.HashSet;
import java.util.Set;

import static com.lambdaschool.linkedlistquestions.Node.removeNode;

public class Main {

    public static void main(String[] args) {
	Node n1 = new Node(9);
	n1.appendToTail(8);
	n1.appendToTail(7);
	n1.appendToTail(6);
	n1.appendToTail(5);

	Node n2 = new Node(1);
	n2.appendToTail(2);
	n2.appendToTail(3);
	n2.appendToTail(2);
	n2.appendToTail(1);

		System.out.println(palindrome(n1));
		System.out.println(palindrome(n2));

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

	public static boolean palindrome(Node n1){
    	Node n2 = reverseList(n1, null);
    	while(n1 != null){
    		if(n1.data != n2.data){
    			return false;
			}
    		n1 = n1.next;
    		n2 = n2.next;
		}
    	return true;
	}

	public static Node reverseList(Node list, Node prev){
    	if(list == null){
    		return prev;
		}
    	Node cur = new Node(list.data);
    	cur.next = prev;
    	list = list.next;
    	return reverseList(list, cur);
	}


}
