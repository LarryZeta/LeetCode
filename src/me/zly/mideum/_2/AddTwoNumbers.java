package me.zly.mideum._2;

import me.zly.definition.ListNode;

/**
 * @author zly
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits
 * are stored in reverse order and each of their nodes contain a single digit. Add the two
 * numbers and return it as a linked list. You may assume the two numbers do not contain any
 * leading zero, except the number 0 itself.
 *
 * Example:
 *        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *        Output: 7 -> 0 -> 8
 *        Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(l1.val + l2.val);
        ListNode l = l3;
        int flag = 0;

        while(l1 != null ||l2 != null) {
            flag = 0;
            if(l.val >= 10) {
                flag = 1;
                l.val %= 10;
            }
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            if(l1 != null && l2 != null) {
                l.next = new ListNode(l1.val + l2.val + flag);
            } else if(l1 == null && l2 != null) {
                l.next = new ListNode(l2.val + flag);
            } else if(l2 == null && l1 !=null) {
                l.next = new ListNode(l1.val + flag);
            }
            if(l.next != null)
                l = l.next;
        }
        if(flag == 1)
            l.next = new ListNode(1);

        return l3;
    }
}
