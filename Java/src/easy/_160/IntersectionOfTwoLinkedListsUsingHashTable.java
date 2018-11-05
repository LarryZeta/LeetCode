package easy._160;

import definition.ListNode;

import java.util.HashSet;

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
 *
 * Time complexity : O(m+n).
 *
 * Space complexity : O(m) or O(n).
 */

public class IntersectionOfTwoLinkedListsUsingHashTable {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;

        HashSet<ListNode> nodes = new HashSet<>();

        while (nodeA != null) {
            nodes.add(nodeA);
            nodeA = nodeA.next;
        }

        while (nodeB != null) {
            if (nodes.contains(nodeB)) return nodeB;
            nodeB = nodeB.next;
        }

        return null;
    }

}
