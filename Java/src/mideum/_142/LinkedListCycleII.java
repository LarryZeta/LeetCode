package mideum._142;

import definition.ListNode;

/**
 * @author zly
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */

// TODO
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        ListNode oneStep = head;
        ListNode twoSteps = head;

        int count = 0;

        while (oneStep != null && twoSteps != null && twoSteps.next != null) {
            oneStep = oneStep.next;
            twoSteps = twoSteps.next.next;
            count ++;
            if (oneStep == twoSteps) break;
        }

        if (oneStep != twoSteps) return null;
        else {
            int firstLength = count;
            while (oneStep != null && twoSteps != null && twoSteps.next != null) {
                oneStep = oneStep.next;
                twoSteps = twoSteps.next.next;
                count ++;
                if (oneStep == twoSteps) break;
            }
            int cycleLength = count - firstLength;
            int loc = firstLength - cycleLength;
            ListNode node = head;
            for (int i = 0; i < loc; i ++) node = node.next;
            return node;

        }

    }

}
