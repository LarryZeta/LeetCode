package me.zly._21;

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
