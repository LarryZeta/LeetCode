package easy._117;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    }

    public Node connect(Node root) {

        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        Queue<Node> queueNext = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queueNext.add(node.left);
            }
            if (node.right != null) {
                queueNext.add(node.right);
            }
            if (!queue.isEmpty()) {
                node.next = queue.peek();
            } else {
                queue = queueNext;
                queueNext = new LinkedList<>();
            }

        }

        return root;
    }

}
