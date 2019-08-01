package org.phonylou.algorithmlearning.singlelist.basesolution;

import org.phonylou.algorithmlearning.singlelist.Node;

public class Solution {
    public boolean isPalindrome(Node head) {
        // 如果头指针为空或者头指针的下一节点为空，意味着链表没有节点或只有单节点，必然是回文
        if (head == null || head.getNext() == null) {
            return true;
        }
        // 采用快慢指针，快指针每次走两步，慢指针每次走一步，在快指针走到列表尾端时慢指针指向
        // 列表中部。并且慢指针会反序已走过的节点，这样用前序指针和慢指针分别扫描列表，一一比对
        // 节点值。
        Node pre = null;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            Node next = slow.getNext();
            slow.setNext(pre);
            pre = slow;
            slow = next;
        }

        if (fast != null) {
            slow = slow.getNext();
        }

        while (slow != null) {
            if (!slow.getVal().equals(pre.getVal())) {
                return false;
            }
            slow = slow.getNext();
            pre = pre.getNext();
        }

        return true;
    }
}
