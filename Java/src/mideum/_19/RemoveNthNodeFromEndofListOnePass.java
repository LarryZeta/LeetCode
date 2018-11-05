package mideum._19;

import definition.ListNode;

/**
 * @author zly
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

public class RemoveNthNodeFromEndofListOnePass {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = head;

        while (n -- != 0) node = node.next;

        if (node == null) { head = head.next; return head;}

        ListNode delnode = head;

        while (node.next != null) { delnode = delnode.next; node = node.next; }

        ListNode tmp = delnode.next;
        delnode.next = delnode.next.next;
        tmp = null;

        return head;

    }

}
