package easy._155;

import definition.ListNode;

import java.util.Stack;

/**
 * @author Larry
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */


public class MinStack {

    final int error = Integer.MAX_VALUE;

    ListNode top;
    Stack<Integer> min = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {}

    public void push(int x) {
        if (top == null) {
            top = new ListNode(x);
            min.push(x);
        }
        else {
            ListNode tmp = new ListNode(x);
            tmp.next = top;
            top = tmp;
            if (x <= min.peek()) min.push(x);
        }
    }

    public void pop() {
        if (top != null) {
            if (top.val == min.peek())
                min.pop();
            top = top.next;
        }
    }

    public int top() {
        if (top != null) return top.val;
        else return error;
    }

    public int getMin() {
        if (!min.isEmpty()) return min.peek();
        else return error;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */