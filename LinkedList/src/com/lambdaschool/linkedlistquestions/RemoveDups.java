package com.lambdaschool.linkedlistquestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
    public void removeDups(Node n){
        Set<Integer> seen = new HashSet<Integer>();
        Node prev = n;
        Node cur = n;
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
}
