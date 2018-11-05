package easy._141;

import definition.ListNode;

import java.util.HashSet;

/**
 * @author zly
 *
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();

        while (head != null) {
            int size = hashSet.size();
            hashSet.add(head);
            head = head.next;
            if (size == hashSet.size()) return true;
        }

        return false;

    }

}
