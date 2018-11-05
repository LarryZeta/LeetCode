package easy._141;

import definition.ListNode;

/**
 * @author zly
 *
 * Given a linked list, determine if it has a cycle in it.
 */

public class LinkedListCycleWithoutUsingExtraSpace {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        ListNode oneStep = head;
        ListNode twoSteps = head;

        while (oneStep != null && twoSteps != null && twoSteps.next != null) {
            oneStep = oneStep.next;
            twoSteps = twoSteps.next.next;
            if (oneStep == twoSteps) return true;
        }

        return false;

    }

}
