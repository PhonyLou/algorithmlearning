package org.phonylou.algorithmlearning.singlelist.combine;

import org.phonylou.algorithmlearning.singlelist.IntNode;
import org.phonylou.algorithmlearning.singlelist.reverse.ReverseSolution;

public class CombineTest {
    public static void main(String[] args) {
        CombineSolution solution = new CombineSolution();
        IntNode head = prepareData();
        IntNode head2 = prepareData2();
        IntNode res = solution.combine(head, head2);


        while (res != null) {
            System.out.println(res.getVal());
            res = res.getNext();
        }
    }

    private static IntNode prepareData() {
        IntNode head = new IntNode();
        // abcba
        IntNode node1 = new IntNode();
        IntNode node2 = new IntNode();
        IntNode node3 = new IntNode();
        IntNode node4 = new IntNode();

        head.setVal(0);
        node1.setVal(5);
        node2.setVal(7);
        node3.setVal(9);
        node4.setVal(14);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);

        return head;
    }

    private static IntNode prepareData2() {
        IntNode head = new IntNode();
        // abcba
        IntNode node1 = new IntNode();
//        IntNode node2 = new IntNode();
//        IntNode node3 = new IntNode();
//        IntNode node4 = new IntNode();

        head.setVal(0);
        node1.setVal(3);
//        node2.setVal(2);
//        node3.setVal(3);
//        node4.setVal(4);
        head.setNext(node1);
//        node1.setNext(node2);
//        node2.setNext(node3);
//        node3.setNext(node4);
//        node4.setNext(null);

        return head;
    }
}
