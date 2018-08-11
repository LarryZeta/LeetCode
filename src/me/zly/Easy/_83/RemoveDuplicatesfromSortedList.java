package me.zly.Easy._83;

// Given a sorted linked list, delete all duplicates such that each element appear only once.
//
// Example 1:
//        Input: 1->1->2
//        Output: 1->2
//
// Example 2:
//        Input: 1->1->2->3->3
//        Output: 1->2->3

public class RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode listNode = head;

        while (listNode != null && listNode.next != null) {
            if (listNode.next.val == listNode.val) {
                listNode.next = listNode.next.next;
            } else listNode = listNode.next;
        }

        return head;
    }

}
