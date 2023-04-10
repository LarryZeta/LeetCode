package easy._234;

import definition.ListNode;

import java.util.Stack;

/**
 * @author Larry
 *
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        node = head;
        while (!stack.isEmpty()) {
            if (node.val != stack.pop()) return false;
            node = node.next;
        }

        return true;

    }

}
