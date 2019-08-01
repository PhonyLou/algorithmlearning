package org.phonylou.algorithmlearning.singlelist.practice;

import org.phonylou.algorithmlearning.singlelist.Node;

public class Solution {
    public boolean isPalindrome(Node head) {
        if (head == null || head.getNext() == null) {
            return true;
        }

        Node prev = null;
        Node slow = head;
        Node fast = head;

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
