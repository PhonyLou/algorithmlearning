package org.phonylou.algorithmlearning.singlelist.practice2;

import org.phonylou.algorithmlearning.singlelist.Node;

public class Solution {
    public boolean isRepeat(Node head) {
        Node fast = head;
        Node slow = head;
        Node prev = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            Node next = slow.getNext();
            slow.setNext(prev);
            prev = slow;
            slow = next;
        }
        if (fast != null) {
            slow = slow.getNext();
        }
        while (slow != null) {
            if (!slow.getVal().equals(prev.getVal())) {
                return false;
            }
            slow = slow.getNext();
            prev = prev.getNext();
        }
        return true;
    }
}
