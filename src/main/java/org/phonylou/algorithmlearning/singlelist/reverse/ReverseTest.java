package org.phonylou.algorithmlearning.singlelist.reverse;

import org.phonylou.algorithmlearning.singlelist.Node;
import org.phonylou.algorithmlearning.singlelist.practice2.Solution;

public class ReverseTest {
    public static void main(String[] args) {
        ReverseSolution solution = new ReverseSolution();
        Node head = prepareData();
        Node target = solution.reverse(head);
        while (target != null) {
            System.out.println(target.getVal());
            target = target.getNext();
        }

        Node head2 = prepareData2();
        Node target2 = solution.reverse(head2);
        while (target2 != null) {
            System.out.println(target2.getVal());
            target2 = target2.getNext();
        }
    }

    private static Node prepareData() {
        Node head = new Node();
        // abcba
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        head.setVal("0");
        node1.setVal("1");
        node2.setVal("2");
        node3.setVal("3");
        node4.setVal("4");
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);

        return head;
    }

    private static Node prepareData2() {
        Node head = new Node();
        // abcba
        Node node1 = new Node();
//        Node node2 = new Node();
//        Node node3 = new Node();
//        Node node4 = new Node();

        head.setVal("0");
        node1.setVal("1");
//        node2.setVal("2");
//        node3.setVal("3");
//        node4.setVal("4");
        head.setNext(node1);
//        node1.setNext(node2);
//        node2.setNext(node3);
//        node3.setNext(node4);
//        node4.setNext(null);

        return head;
    }
}
