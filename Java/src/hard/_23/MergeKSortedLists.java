package hard._23;

import definition.ListNode;

/**
 * @author Larry
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) return null;

        ListNode head = lists[0];

        for(int i = 1; i < lists.length; i ++) {
            head = mergeKLists(head, lists[i]);
        }

        return head;
    }

    ListNode mergeKLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode node = head;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        if (l1 == null) node.next = l2;
        else node.next = l1;

        return head.next;
    }

}
