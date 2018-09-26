package me.zly.easy._160;

import me.zly.definition.ListNode;
import me.zly.easy._141.LinkedListCycleWithoutUsingExtraSpace;

/**
 * @author zly
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 *
 * For example, the following two linked lists:
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 *
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * Credits:
 * Special thanks to @stellari for adding this problem and creating all test cases.
 *
 * Time complexity : O(m+n).
 *
 * Space complexity : O(1).
 */

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null||headB==null) return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        int indexA = 1;
        int indexB = 1;

        while(nodeA!=null) {
            nodeA = nodeA.next;
            ++ indexA;
        }

        while(nodeB!=null) {
            nodeB = nodeB.next;
            ++ indexB;
        }

        nodeA = headA;
        nodeB = headB;

        if(indexB >= indexA) {
            int minus = indexB - indexA;
            while(minus != 0) {
                nodeB = nodeB.next;
                -- minus;
            }
        } else {
            int minus = indexA - indexB;
            while(minus != 0) {
                nodeA = nodeA.next;
                -- minus;
            }
        }

        while(nodeA != null && nodeB != null) {
            if(nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return null;

    }

}
