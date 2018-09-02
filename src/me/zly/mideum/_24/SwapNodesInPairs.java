package me.zly.mideum._24;

import me.zly.definition.ListNode;

/**
 * @author zly
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 *
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode node0 = head;
        ListNode node1 = head.next;

        head = node1;

        ListNode next = node1.next;
        node1.next = node0;
        node0.next = next;

        ListNode pre = node0;
        node0 = next;
        if (node0 != null) node1 = node0.next;


        while (node0 != null && node1 != null) {

            next = node1.next;
            node1.next = node0;
            node0.next = next;
            pre.next = node1;
            pre = node0;

            if (next != null && next.next != null) {
                node0 = next;
                node1 = node0.next;
            } else break;

        }

        return head;

    }

}
