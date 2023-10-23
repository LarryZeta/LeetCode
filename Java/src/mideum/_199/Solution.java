package mideum._199;

import definition.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new LinkedList<>();

        if (root == null) {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queueNext = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node.left != null) {
                queueNext.add(node.left);
            }
            if (node.right != null) {
                queueNext.add(node.right);
            }

            if (queue.isEmpty()) {
                list.add(node.val);
                queue = queueNext;
                queueNext = new LinkedList<>();
            }
        }

        return list;

    }

}
