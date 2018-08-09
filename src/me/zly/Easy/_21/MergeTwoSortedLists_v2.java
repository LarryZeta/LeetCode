package me.zly.Easy._21;

// Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
// Example:
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4


public class MergeTwoSortedLists_v2 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode node = l3;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
                continue;
            }
            if (l1.val <= l2.val) {
                node.next = new ListNode(l1.val);
                node = node.next;
                l1 = l1.next;
            } else {
                node.next = new ListNode(l2.val);
                node = node.next;
                l2 = l2.next;
            }
        }



        return l3.next;

    }

}
