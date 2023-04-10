package mideum._24;

import definition.ListNode;

/**
 * @author Larry
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

        ListNode node = head;

        head = head.next;

        ListNode pre = null;

        while (node != null && node.next != null) {

            ListNode next = node.next;

            node.next = next.next;
            next.next = node;

            if (pre != null) pre.next = next;
            pre = node;

            node = node.next;

        }

        return head;

    }

}
