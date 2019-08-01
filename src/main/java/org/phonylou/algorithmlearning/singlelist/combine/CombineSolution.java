package org.phonylou.algorithmlearning.singlelist.combine;

import org.phonylou.algorithmlearning.singlelist.IntNode;

import java.util.ArrayList;
import java.util.Collections;

public class CombineSolution {
    // Return directly when list is empty or just contains one element
    public IntNode combine(IntNode head1, IntNode head2) {
        if (head1 == null & head2 == null) {
            return null;
        }
        ArrayList<Integer> valArr = new ArrayList<>();
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                valArr.add(head1.getVal());
                head1 = head1.getNext();
            }
            if (head2 != null) {
                valArr.add(head2.getVal());
                head2 = head2.getNext();
            }
        }
        Collections.sort(valArr);
        IntNode resultNode = new IntNode();
        resultNode.setVal(valArr.get(0));
        IntNode head = resultNode;
        for (int i = 1; i < valArr.size(); i++) {
            IntNode next = new IntNode();
            next.setVal(valArr.get(i));
            resultNode.setNext(next);
            resultNode = next;
        }
        return head;
    }
}
