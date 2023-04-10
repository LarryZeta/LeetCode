package easy._206;

import definition.ListNode;

/**
 * @author Larry
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
 * Recursive solution.
 */

public class ReverseLinkedListRecursive {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) return head;
        else {
            ListNode rear = head;
            while (rear.next != null) rear = rear.next;
            reverse(head);
            return rear;
        }

    }

    ListNode reverse(ListNode node) {

        if (node.next == null) return node;
        else {
            reverse(node.next).next = node;
            node.next = null;
            return node;
        }

    }

}
