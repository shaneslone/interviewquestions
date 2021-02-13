package com.lambdaschool.linkedlistquestions;

import java.util.HashSet;
import java.util.Set;

public class Node {
    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public void removeNode(Node n){
        n.data = n.next.data;
        n.next = n.next.next;
    }

    public void removeDups(){
        Set<Integer> seen = new HashSet<Integer>();
        Node prev = this;
        Node cur = this;
        while (cur != null){
            Node next = cur.next;
            if(seen.contains(cur.data)){
                prev.next = next;
                cur = next;
            } else {
                seen.add(cur.data);
                prev = cur;
                cur = next;
            }
        }

    }
    public void print(){
        Node cur = this;
        while(cur != null){
            if(cur.next == null){
                System.out.println(cur.data);
                break;
            } else {
                System.out.print(cur.data + " -> ");
                cur = cur.next;
            }
        }
        System.out.println();
    }

}
