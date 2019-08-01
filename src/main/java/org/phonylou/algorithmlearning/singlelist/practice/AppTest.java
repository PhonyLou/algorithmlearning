package org.phonylou.algorithmlearning.singlelist.practice;

import org.phonylou.algorithmlearning.singlelist.Node;

public class AppTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node head = new Node();
        // abcba
        head.setVal("a");
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();

        node1.setVal("b");
        node2.setVal("c");
        node3.setVal("b");
        node4.setVal("a");
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(null);

        System.out.println(solution.isPalindrome(head));
    }
}
