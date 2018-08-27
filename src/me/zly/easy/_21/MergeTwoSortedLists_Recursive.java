package me.zly.easy._21;

import me.zly.definition.ListNode;

/**
 * @author zly
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *        Input: 1->2->4, 1->3->4
 *        Output: 1->1->2->3->4->4
 */


public class MergeTwoSortedLists_Recursive {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }

    }

}
