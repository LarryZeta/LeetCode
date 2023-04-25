package definition;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Definition for a binary tree node.
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public TreeNode(Integer... a) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean left = true;
        for (Integer i : a) {
            if (i == null) {
                left = !left;
                if (left) {
                    queue.remove();
                }
                continue;
            }
            TreeNode node = new TreeNode(i);
            if (queue.isEmpty()) {
                this.val = i;
                queue.add(this);
                continue;
            }
            TreeNode now = queue.peek();
            if (left) {
                now.left = node;
                queue.add(node);
                left = false;
            } else {
                now.right = node;
                queue.add(node);
                left = true;
                queue.remove();
            }
        }
    }

}