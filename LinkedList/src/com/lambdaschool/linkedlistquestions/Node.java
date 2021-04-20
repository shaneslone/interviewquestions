package com.lambdaschool.linkedlistquestions;

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
