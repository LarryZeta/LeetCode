package me.zly.easy._206;

import me.zly.definition.ListNode;

import java.util.Stack;

/**
 * @author zly
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 *
 * Iterative solution.
 */

public class ReverseLinkedListIterative {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) return head;

        Stack<Integer> stack = new Stack<>();

        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        node = head;
        while (!stack.isEmpty()) {
            node.val = stack.pop();
            node = node.next;
        }

        return head;

    }

}
