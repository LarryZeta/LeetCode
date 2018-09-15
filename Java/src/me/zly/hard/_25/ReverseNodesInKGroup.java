package me.zly.hard._25;

import me.zly.definition.ListNode;

import java.util.Stack;

/**
 * @author zly
 *
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 *
 * Example:
 *
 * Given this linked list: 1->2->3->4->5
 *
 * For k = 2, you should return: 2->1->4->3->5
 *
 * For k = 3, you should return: 3->2->1->4->5
 *
 * Note:
 *
 * Only constant extra memory is allowed.
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 */

public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode node = new ListNode(0);
        node.next = head;
        head = node;


        while (node != null) {
            ListNode pre = node;
            node = node.next;
            ListNode subHead = node;
            for (int i = 0; i < k; i ++) {
                if (node == null) return head.next;
                node = node.next;
            }
            ListNode nextHead = node;


            Stack<ListNode> stack = new Stack<>();

            for (int i = 0; i < k; i ++) {
                stack.push(subHead);
                subHead = subHead.next;
            }

            ListNode pop = stack.pop();
            pre.next = pop;
            while (!stack.isEmpty()) {
                pop.next = stack.pop();
                pop = pop.next;
            }
            pop.next = nextHead;
            node = pop;

        }

        return head.next;
    }

}
