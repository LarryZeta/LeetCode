package mideum._19;

import definition.ListNode;


/**
 * @author Larry
 *
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 */

public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;

        int length = 0;

        while (node != null) {
            node = node.next;
            length ++;
        }

        int loc = length - n;
        node = head;

        if (loc == 0) head = head.next;

        else {
            for (int i = 0; i < loc - 1; i ++) node = node.next;
            ListNode tmp = node.next;
            node.next = node.next.next;
            tmp = null;
        }

        return head;

    }

}
