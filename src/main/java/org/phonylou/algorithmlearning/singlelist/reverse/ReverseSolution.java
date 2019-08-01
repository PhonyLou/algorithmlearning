package org.phonylou.algorithmlearning.singlelist.reverse;

import org.phonylou.algorithmlearning.singlelist.Node;

public class ReverseSolution {
    // Return directly when list is empty or just contains one element
    public Node reverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node pre = null;
        while (head != null) {
            Node next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }
        return pre;
    }
}
